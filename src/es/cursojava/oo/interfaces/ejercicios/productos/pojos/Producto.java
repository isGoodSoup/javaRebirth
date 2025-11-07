package es.cursojava.oo.interfaces.ejercicios.productos.pojos;

import es.cursojava.oo.interfaces.ejercicios.productos.main.Identificador;

public abstract class Producto extends Identificador {
	private String nombre;
	private double precio;
	
	public Producto() {}
	
	public Producto(int identificador, String nombre, double precio) {
		super();
		this.id = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
