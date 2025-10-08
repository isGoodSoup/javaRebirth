package es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Alimentos;

public class Platano extends Alimentos {
	private String tipo;
	
	public Platano(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
