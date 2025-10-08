package es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Alimentos;

public class Manzana extends Alimentos {
	private String color;

	public Manzana(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
