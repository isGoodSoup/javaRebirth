package es.cursojava.oo.colecciones.ejercicios.supermercado.alimentos;

import es.cursojava.oo.colecciones.ejercicios.supermercado.Alimentos;

public class Baguette extends Alimentos {
	private boolean isRecien;

	public Baguette(boolean isRecien) {
		super();
		this.isRecien = isRecien;
	}

	public boolean isRecien() {
		return isRecien;
	}

	public void setRecien(boolean isRecien) {
		this.isRecien = isRecien;
	}
}
