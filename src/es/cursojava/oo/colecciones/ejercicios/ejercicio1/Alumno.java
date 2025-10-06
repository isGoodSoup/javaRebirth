package es.cursojava.oo.colecciones.ejercicios.ejercicio1;

public class Alumno {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] notas;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String dni, double notaMedia, String[] notas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.notas = notas;
	}
	
	public Alumno(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}
}
