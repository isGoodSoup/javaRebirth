package es.cursojava.oo.herencia.ejercicios.banda;

public class Guitarra extends Instrumento {
	private int numCuerdas;
	
	public Guitarra() {
		
	}

	public Guitarra(int numCuerdas) {
		super();
		this.numCuerdas = numCuerdas;
	}
	
	public void afinar() {
		
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
}
