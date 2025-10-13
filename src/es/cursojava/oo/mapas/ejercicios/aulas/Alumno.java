package es.cursojava.oo.mapas.ejercicios.aulas;

public class Alumno {
	private String nombre;
	private String dni;
	private double notaMedia;
	private int creditos;
	
	public Alumno(String nombre, String dni, double notaMedia, int creditos) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.creditos = creditos;
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

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
}
