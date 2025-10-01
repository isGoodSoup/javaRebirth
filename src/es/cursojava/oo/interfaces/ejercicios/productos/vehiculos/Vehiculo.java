package es.cursojava.oo.interfaces.ejercicios.productos.vehiculos;

import es.cursojava.oo.interfaces.ejercicios.productos.main.Identificador;

public abstract class Vehiculo extends Identificador {
	private String nombre;
	private int numRuedas;
	private double precio;
	
	public Vehiculo() {}
	
	public Vehiculo(int identificador, String nombre, int numRuedas, double precio) {
		super();
		this.identificador = identificador;
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
