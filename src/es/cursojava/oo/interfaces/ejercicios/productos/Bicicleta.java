package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Bicicleta extends Vehiculo {
	private int numMarchas;

	public Bicicleta(String nombre, int numRuedas, double precio, int numMarchas) {
		super(nombre, numRuedas, precio);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
}
