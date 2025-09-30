package es.cursojava.oo.interfaces.ejercicios.productos;

public class Zanahoria extends Alimentos {
	private int numFrodas;
	private String origen;

	public Zanahoria(int id, String fechaCaducidad, int numFrodas, String origen) {
		super(id, fechaCaducidad);
		this.numFrodas = numFrodas;
		this.origen = origen;
	}

	public int getNumFrodas() {
		return numFrodas;
	}

	public void setNumFrodas(int numFrodas) {
		this.numFrodas = numFrodas;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
