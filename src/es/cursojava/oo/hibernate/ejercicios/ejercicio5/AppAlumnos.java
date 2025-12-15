package es.cursojava.oo.hibernate.ejercicios.ejercicio5;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.filereader.utils.FileReader;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Aula;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.oo.hibernate.ejercicios.ejercicio5.entities.Alumno;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;

public class AppAlumnos implements Iniciable {
	private List<String> alumnosCursoTxt;
	private List<String> aulasTxt;
	private List<String> cursosAulaTxt;
	
	public static void main(String[] args) {
		AppAlumnos alumnos = new AppAlumnos();
		alumnos.init();
		alumnos.getAlumno100();
	}
	
	@Override
	public void init() {
		FileReader fr = new FileReader();
		try {
			alumnosCursoTxt  = fr.readFile("./alumnos_curso.txt");
			aulasTxt		 = fr.readFile("./aulas.txt");
			cursosAulaTxt 	 = fr.readFile("./cursos_aula.txt");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Session session = HibernateUtils.getSession();
		session.beginTransaction();

		List<Aula> aulas = new ArrayList<>();
		for (String linea : aulasTxt) {
			if (linea.startsWith("codigoAula"))
				continue;
			String[] p = linea.split(";");
			Aula aula = new Aula(p[0], p[1], Integer.parseInt(p[1]));
			session.persist(aula);
			aulas.add(aula);
		}

		List<Curso> cursos = new ArrayList<>();
		for (String linea : cursosAulaTxt) {
			if (linea.startsWith("código"))
				continue;
			String[] p = linea.split(";");
			Curso curso = new Curso();
			curso.setCodigo(Integer.parseInt(p[0]));
			curso.setNombre(p[1]);
			curso.setDescripcion(p[2]);
			curso.setHoras_totales(Integer.parseInt(p[3]));
			curso.setActivo(Boolean.parseBoolean(p[4]));
			curso.setNivel(p[5]);
			curso.setCategoria(p[6]);
			curso.setPrecio(new BigDecimal(p[7]));
			curso.setFecha_inicio(LocalDate.parse(p[8]));
			curso.setFecha_fin(LocalDate.parse(p[9]));
			curso.setFecha_creacion(null);

			String nombreAula = p[11];
			Aula aulaAsignada = aulas.stream()
					.filter(a -> a.getNombre().equals(nombreAula)).findFirst()
					.orElse(null);

			curso.setAula(aulaAsignada);

			session.persist(curso);
			cursos.add(curso);
		}

		for (String linea : alumnosCursoTxt) {
			if (linea.startsWith("nombre"))
				continue;
			String[] p = linea.split(";");
			Alumno alumno = new Alumno(p[0], p[1], Integer.parseInt(p[2]));
			int codigoCurso = Integer.parseInt(p[3]);
			Curso curso = cursos.stream()
					.filter(c -> c.getCodigo() == codigoCurso).findFirst()
					.orElse(null);
			if (curso != null) {
				curso.addAlumno(alumno);
			}
		}
		session.getTransaction().commit();
		session.close();
		System.out.println("Datos importados correctamente");
	}

	public void getAlumno100() {
		try (Session session = HibernateUtils.getSession()) {
			Alumno alumno = session
					.createQuery("FROM Alumno a WHERE a.nombre = :nombre",
							Alumno.class)
					.setParameter("nombre", "alumno100").getResultStream()
					.findFirst().orElse(null);
			if (alumno != null) {
				System.out.println(alumno.getNombre() + " - "
						+ alumno.getEmail() + " - " + alumno.getEdad());
			} else {
				System.out.println("Alumno no encontrado");
			}
		}
	}
}
