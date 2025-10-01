package es.cursojava.oo.interfaces.ejercicios.productos.alimentos;

public class Banana extends Alimentos {
	private double longitud;
	private String origen;
	
	public Banana() {}
	
	public Banana(String fechaCaducidad, double longitud, String origen) {
		super(fechaCaducidad);
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

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		id.createId();
	}
}
