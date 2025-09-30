package es.cursojava.oo.interfaces.ejercicios.productos;

public class Montahna extends Bicicleta {
	private String marca;
	private int numCadenas;
	
	public Montahna() {}
	
	public Montahna(String nombre, int numRuedas, double precio, int id, int numMarchas, String marca, int numCadenas) {
		super(nombre, numRuedas, precio, id, numMarchas);
		this.marca = marca;
		this.numCadenas = numCadenas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumCadenas() {
		return numCadenas;
	}

	public void setNumCadenas(int numCadenas) {
		this.numCadenas = numCadenas;
	}
}
