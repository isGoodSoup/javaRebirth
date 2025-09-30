package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Bicicleta extends Vehiculo {
	private int id;
	private int numMarchas;

	public Bicicleta(String nombre, int numRuedas, double precio, int id, int numMarchas) {
		super(nombre, numRuedas, precio);
		this.id = id;
		this.numMarchas = numMarchas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
}
