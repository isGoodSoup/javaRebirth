package es.cursojava.oo.colecciones.ejercicios.supermercado.pojos;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Alimentos;

public class Baguette extends Alimentos {
	private boolean isRecien;
	private String tipo;

	public Baguette(boolean isRecien, String tipo) {
		super();
		this.isRecien = isRecien;
		this.tipo = tipo;
	}

	public boolean isRecien() {
		return isRecien;
	}

	public void setRecien(boolean isRecien) {
		this.isRecien = isRecien;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
