package es.cursojava.oo.interfaces.ejercicios.productos;

public class Tablet extends ProductosElectronicos {
	private String serial;
	private String origen;

	public Tablet(int id, String fechaFabricacion, String serial, String origen) {
		super(id, fechaFabricacion);
		this.serial = serial;
		this.origen = origen;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public void apagar() {
		
	}

	@Override
	public void encender() {
	
	}
}
