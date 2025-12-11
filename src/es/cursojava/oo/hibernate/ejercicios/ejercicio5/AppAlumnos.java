package es.cursojava.oo.hibernate.ejercicios.ejercicio5;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.Session;

import com.filereader.utils.FileReader;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.dto.CursoDTO;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Aula;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.oo.hibernate.ejercicios.ejercicio5.dao.AlumnoDAO;
import es.cursojava.oo.hibernate.ejercicios.ejercicio5.entities.Alumno;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;
import utils.Dexter;

public class AppAlumnos implements Iniciable {
	private AlumnoDAO dao = new AlumnoDAO();
	private List<String> alumnos_curso;
	private List<Alumno> alumnos = new ArrayList<>();
	private List<String> aulas_txt;
	private List<Aula> aulas = new ArrayList<>();
	private List<String> cursos_aula;
	private List<Curso> cursos = new ArrayList<>();
	
	public static void main(String[] args) {
		AppAlumnos alumnos = new AppAlumnos();
		alumnos.init();
		alumnos.getAlumno100();
	}

	@Override
	public void init() {
		FileReader fr = new FileReader();
		try {
			alumnos_curso = fr.readFile("./alumnos_curso.txt");
			aulas_txt = fr.readFile("./aulas.txt");
			cursos_aula = fr.readFile("./cursos_aula.txt");
		} catch (IOException e) {
			Dexter.printException(e);
		}
		
		for (String linea : alumnos_curso) {
			if(linea.startsWith("nombre")) { continue; }
			String[] partes = linea.trim().split(";");
			Alumno alumno = new Alumno(
					partes[0], 
					partes[1], 
					Integer.parseInt(partes[2])
			);
			alumnos.add(alumno);
		}
		System.out.println("Alumnos creados");
		
		for (String linea : aulas_txt) {
			if(linea.startsWith("codigoAula")) { continue; }
			String[] partes = linea.trim().split(";");
			Aula aula = new Aula(
					partes[0],
					Integer.parseInt(partes[1]),
					partes[2]
			);
			aulas.add(aula);
		}
		System.out.println("Aulas creadas");
		
		for (String linea : cursos_aula) {
			if(linea.startsWith("código")) { continue; }
			String[] partes = linea.trim().split(";");
			Curso curso = new CursoDTO();
			curso.setCodigo(Integer.parseInt(partes[0]));
			curso.setNombre(partes[1]);
			curso.setDescripcion(partes[2]);
			curso.setHoras_totales(Integer.parseInt(partes[3]));
			curso.setActivo(Boolean.parseBoolean(partes[4]));
			curso.setNivel(partes[5]);
			curso.setCategoria(partes[6]);
			curso.setPrecio(new BigDecimal(partes[7]));
			curso.setFecha_inicio(LocalDate.parse(partes[8]));
			curso.setFecha_fin(LocalDate.parse(partes[9]));
			curso.setFecha_creacion(null);
			String nombreAula = partes[11];
			Aula aulaAsignada = aulas.stream()
			        .filter(a -> a.getNombre().equals(nombreAula))
			        .findFirst()
			        .orElse(null);
			curso.setAula(aulaAsignada);
			cursos.add(curso);
		}
		System.out.println("Cursos creados");
		
		for (int i = 0; i < alumnos.size(); i++) {
		    Alumno alumno = alumnos.get(i);
		    int codigoCurso = Integer.parseInt(alumnos_curso.get(i + 1).split(";")[3]); // +1 si hay encabezado
		    Curso curso = cursos.stream()
		            .filter(c -> Objects.equals(c.getCodigo(), codigoCurso))
		            .findFirst()
		            .orElse(null);
		    if (curso != null) {
		        alumno.setCurso(curso);
		        curso.getAlumnos().add(alumno);
		    }
		}
		System.out.println("Cursos asignados");
		
		for (Alumno alumno : alumnos) {
			dao.guardar(alumno);
		}
		dao.commit();
		System.out.println("Alumnos añadidos");
	}
	
	public void getAlumno100() {
	    try (Session session = HibernateUtils.getSession()) {
	    	Alumno alumno = session.createQuery(
	    		    "FROM Alumno a WHERE a.nombre = :nombreAlumno", Alumno.class)
	    		    .setParameter("nombreAlumno", "alumno100")
	    		    .uniqueResult();
	        if (alumno != null) {
	            System.out.println(alumno.getNombre() + " - " + alumno.getEmail() + " - " + alumno.getEdad());
	        } else {
	            System.out.println("Alumno no encontrado");
	        }
	    }
	}
}
