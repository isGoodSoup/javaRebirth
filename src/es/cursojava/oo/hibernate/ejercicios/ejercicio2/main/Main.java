package es.cursojava.oo.hibernate.ejercicios.ejercicio2.main;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.utils.Dexter;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;

/*
 * Crear una clase Main que realice las siguientes acciones:
 * 1. Leer los datos de los cursos desde un archivo de texto (cursos.txt).
 * 2. Insertar cada curso en la base de datos utilizando Hibernate.
 */
public class Main implements Iniciable {
//	private CursoDAO dao = new CursoDAO();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	
	/*
	 * Método principal que ejecuta las acciones definidas.
	 * Lee los cursos desde un archivo de texto e inserta cada curso en la base de datos.
	 */
	@Override
	public void init() {
	    String archivo = "./cursos.txt";
	    try {
	        String contenido = Dexter.toLeerArchivo(archivo);
	        for (String linea : contenido.split("\n")) {
	            linea = linea.trim();
	            if (linea.isEmpty()) continue;
	            String[] valores = linea.split("\\|");
	            Curso curso = crearCurso(valores);
	            HibernateUtils.commit(HibernateUtils.insert(curso));
//	            dao.guardarCurso(curso);
//	            dao.commitTransaction();
	        }
	    } catch (IOException e) {
	        Dexter.printException(e);
	    }
	}
	
	/*
	 * Crea un objeto Curso a partir de un array de valores.
	 * @param valores Array de valores que representan los atributos del curso.
	 * @return Objeto Curso creado a partir de los valores proporcionados.
	 */
	public Curso crearCurso(String[] valores) {
	    int id = Integer.parseInt(valores[0]);
	    String nombre = valores[1];
	    String descripcion = valores[2];
	    int duracion = Integer.parseInt(valores[3]);
	    boolean activo = Boolean.parseBoolean(valores[4]);
	    String nivel = valores[5];
	    String categoria = valores[6];
	    double precio = Double.parseDouble(valores[7]);
	    LocalDate inicio = LocalDate.parse(valores[8]);
	    LocalDate fin = LocalDate.parse(valores[9]);
	    LocalDateTime creacion = LocalDateTime.now();

	    return new Curso(
	            id, nombre, descripcion, duracion, activo,
	            nivel, categoria, precio, inicio, fin, creacion
	    );
	}
}
