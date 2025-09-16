package es.cursojava.oo.herencia;

public class Animal {
	private String nombre;
	private double peso;
	private long id;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, double peso, long id) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.id = id;
	}
	
	public void comer() {
		System.out.println("El animal " + this.nombre + " está comiendo");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
