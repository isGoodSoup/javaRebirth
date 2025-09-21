package es.cursojava.oo.ejercicios.hospital;

public class Paciente {
	private String nombre;
	private int id;
	private int edad;
	
	public Paciente() {
		
	}

	public Paciente(String nombre, int id, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
	}
	
	public Paciente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
