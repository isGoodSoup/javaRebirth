package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Bicicleta extends Vehiculo implements Capitalismo {
	protected Identificador id = new Identificador();
	private int numMarchas;
	
	public Bicicleta() {}
	
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
