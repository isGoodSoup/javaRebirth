package es.cursojava.oo.hibernate.ejercicios.ejercicio1.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;

/*
 * Crear una clase Main que realice las siguientes acciones:
 * 1. Crear una lista de cursos con al menos 4 cursos (utilizando los constructores definidos en la clase Curso).
 * 2. Insertar los cursos en la base de datos utilizando Hibernate.
 * 3. Imprimir todos los cursos almacenados en la base de datos.
 * 4. Imprimir solo los cursos que están activos.
 */
public class Main implements Iniciable {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	
	/*
	 * Método principal que ejecuta las acciones definidas.
	 * 1. Crear una lista de cursos.
	 * 2. Insertar los cursos en la base de datos.
	 * 3. Imprimir todos los cursos.
	 * 4. Imprimir solo los cursos activos.
	 */
	@Override
	public void init() {
		List<Curso> cursos = crearCursos();
		this.insertarCursos(cursos);
		this.imprimirCursos(cursos);
		this.imprimirCursosActivos(cursos);
	}
	
	/*
	 * Crear una lista de cursos con al menos 4 cursos 
	 * (utilizando los constructores definidos en la clase Curso).
	 */
	public List<Curso> crearCursos() {
		Curso c1 = new Curso(
			    101, 
			    "Java Básico", 
			    "Introducción a Java",
			    40, 
			    true, 
			    "Inicial", 
			    "Programación",
			    120.0, LocalDate.now(), 
			    LocalDate.now().plusMonths(1),
			    LocalDateTime.now()
			);

		Curso c2 = new Curso(
			    202, 
			    "Spring Boot Avanzado", 
			    "Spring Boot con microservicios",
			    60, 
			    true, 
			    "Avanzado", 
			    "Backend",
			    220.0, 
			    LocalDate.now().plusDays(10), 
			    LocalDate.now().plusMonths(2),
			    LocalDateTime.now()
		);

		Curso c3 = new Curso(
			    303,
			    "Bases de Datos",
			    "Fundamentos de SQL y modelado",
			    50,
			    false,
			    "Inicial",
			    "BBDD",
			    200.0,
			    LocalDate.now(),
			    LocalDate.now().plusDays(30),
			    LocalDateTime.now()
		);

		Curso c4 = new Curso(
			    404, "Angular Profesional", "Frontend avanzado con Angular",
			    80, 
			    true, 
			    "Intermedio", 
			    "Frontend",
			    250.0, LocalDate.now(),
			    LocalDate.now().plusMonths(3),
			    LocalDateTime.now()
		);
		List<Curso> cursos = new ArrayList<>(List.of(c1, c2, c3, c4));
		return cursos;
	}
	
	/*
	 * Insertar los cursos en la base de datos utilizando Hibernate.
	 */
	public void insertarCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			HibernateUtils.insert(curso);
		}
	}
	
	/*
	 * Imprimir todos los cursos almacenados en la base de datos.
	 */
	public void imprimirCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
	}
	
	/*
	 * Imprimir solo los cursos que están activos.
	 */
	public void imprimirCursosActivos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			if(curso.isActivo()) {
				System.out.println(curso);
			}
		}
	}
}
