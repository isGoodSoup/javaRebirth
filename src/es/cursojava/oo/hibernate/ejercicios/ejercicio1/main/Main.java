package es.cursojava.oo.hibernate.ejercicios.ejercicio1.main;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.Curso;
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
				7811, 
				"Matemáticas Avanzadas", 
				"adsfas", 
				600, 
				true, 
				"Avanzado", 
				"Álgebra", 
		);
		
		Curso c2 = new Curso(
				2542, 
				"Programación Orientada a Objetos", 
				"asdwwwr", 
				670,
				true, 
		);
		
		Curso c3 = new Curso(
				3369, 
				"Cocina Italiana", 
				"rwerwes", 
				200, 
				false, 
				"Básico", 
		);
		
		Curso c4 = new Curso(
				6767, 
				"Conducción de Transporte Público", 
				"xcwqwea", 
				480, 
				false,
		);
		
		List<Curso> cursos = Arrays.asList(c1, c2, c3, c4);
	}
	
	public void imprimirCursos(List<Curso> cursos) {
		
	}
	
	public void imprimirCursosActivos(List<Curso> cursos) {
		
	}
}
