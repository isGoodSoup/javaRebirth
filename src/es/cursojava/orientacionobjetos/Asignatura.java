package es.cursojava.orientacionobjetos;

public class Asignatura {
	
	private String nombre;
	private int curso;
	
	public Asignatura() {
		
	}
	
	public Asignatura(String nombre, int curso) {		
		super();
		this.nombre = nombre;
		this.curso = curso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
