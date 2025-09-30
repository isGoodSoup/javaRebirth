package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Vehiculo {
	private String nombre;
	private int numRuedas;
	private double precio;
	
	public Vehiculo() {}
	
	public Vehiculo(String nombre, int numRuedas, double precio) {
		super();
		this.nombre = nombre;
		this.numRuedas = numRuedas;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
