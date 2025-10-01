package es.cursojava.oo.interfaces.ejercicios.productos.bicicleta;

import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Capitalismo;
import es.cursojava.oo.interfaces.ejercicios.productos.main.Identificador;
import es.cursojava.oo.interfaces.ejercicios.productos.vehiculos.Vehiculo;

public abstract class Bicicleta extends Vehiculo implements Capitalismo {
	protected Identificador id = new Identificador();
	private int numMarchas;
	
	public Bicicleta() {}
	
	public Bicicleta(String nombre, int numRuedas, double precio, int numMarchas, int identificador) {
		super(identificador, nombre, numRuedas, precio);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
}
