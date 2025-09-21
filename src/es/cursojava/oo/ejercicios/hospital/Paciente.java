package es.cursojava.oo.ejercicios.hospital;

public class Paciente {
	private String nombre;
	private String id;
	private int edad;
	
	public Paciente() {
		
	}

	public Paciente(String nombre, String id, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
