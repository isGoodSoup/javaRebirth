package es.cursojava.oo.interfaces.ejercicios.productos.bicicleta;

public class Montahna extends Bicicleta {
	private String marca;
	private int numCadenas;
	
	public Montahna() {}
	
	public Montahna(String nombre, int numRuedas, double precio, int numMarchas, String marca, int numCadenas) {
		super(nombre, numRuedas, precio, numMarchas);
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

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		id.createId();
	}
}
