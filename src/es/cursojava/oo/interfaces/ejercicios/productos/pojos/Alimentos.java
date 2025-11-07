package es.cursojava.oo.interfaces.ejercicios.productos.pojos;

import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Capitalismo;
import es.cursojava.oo.interfaces.ejercicios.productos.main.Identificador;

public abstract class Alimentos extends Producto implements Capitalismo {
	protected Identificador id = new Identificador();
	private String fechaCaducidad;
	
	public Alimentos() {}

	public Alimentos(String fechaCaducidad) {
		super();
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
}
