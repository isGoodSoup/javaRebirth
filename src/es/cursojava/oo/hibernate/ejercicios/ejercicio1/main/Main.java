package es.cursojava.oo.hibernate.ejercicios.ejercicio1.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.Curso;
import es.cursojava.utils.HibernateUtils;
import es.cursojava.utils.interfaces.Iniciable;

public class Main implements Iniciable {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	
	@Override
	public void init() {
		List<Curso> cursos = crearCursos();
		this.imprimirCursos(cursos);
		this.imprimirCursosActivos(cursos);
	}
	
	public List<Curso> crearCursos() {
		Curso c1 = new Curso(
			    1, 101, "Java Básico", "Introducción a Java",
			    40, true, "Inicial", "Programación",
			    120.0, LocalDate.now(), LocalDate.now().plusMonths(1),
			    LocalDateTime.now()
			);

		Curso c2 = new Curso(
			    2, "Spring Boot Avanzado", "Spring Boot con microservicios",
			    60, true, "Avanzado", "Backend",
			    220.0, LocalDate.now().plusDays(10), LocalDate.now().plusMonths(2),
			    LocalDateTime.now()
		);

		Curso c3 = new Curso(
			    3, 303, "Bases de Datos", "Fundamentos de SQL y modelado",
			    50, false,
			    LocalDateTime.now()
		);

		Curso c4 = new Curso(
			    4, "Angular Profesional", "Frontend avanzado con Angular",
			    80, true, "Intermedio", "Frontend",
			    250.0, LocalDate.now(), LocalDate.now().plusMonths(3),
			    LocalDateTime.now()
		);
		List<Curso> cursos = new ArrayList<>(List.of(c1, c2, c3, c4));
		return cursos;
	}
	
	public void insertarCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			HibernateUtils.insert(curso);
		}
	}
	
	public void imprimirCursos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
	}
	
	public void imprimirCursosActivos(List<Curso> cursos) {
		for (Curso curso : cursos) {
			if(curso.isActivo()) {
				System.out.println(curso);
			}
		}
	}
}
