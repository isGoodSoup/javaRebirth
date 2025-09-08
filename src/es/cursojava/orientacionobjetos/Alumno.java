package es.cursojava.orientacionobjetos;

import java.util.Arrays;

public class Alumno {
	
	static int numero;
	private String nombre;
	private String dni;
	private double notaMedia = 10;
	private String[] asignaturas;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String dni, double notaMedia, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void metodo1() {
		
	}
	
	public void estudiar() {
		
		System.out.println("El estudiante " + nombre + 
				"tiene las asignaturas " + Arrays.toString(asignaturas));
		
		if (this.notaMedia < 5) {
			System.out.println("Ha estudiado poco");
		} else if (this.notaMedia >= 9) {
			System.out.println("Es un genio");
		} else {
			System.out.println("Ha estudiado mucho");
		}
	}
}
