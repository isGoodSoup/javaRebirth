package es.cursojava.oo.interfaces.ejercicios.productos;

public class Banana extends Alimentos {
	private double longitud;
	private String origen;
	
	public Banana() {}
	
	public Banana(int id, String fechaCaducidad, double longitud, String origen) {
		super(id, fechaCaducidad);
		this.longitud = longitud;
		this.origen = origen;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
