package es.cursojava.oo.interfaces.ejercicios.productos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tablet extends ProductosElectronicos {
	private String serial;
	private String origen;
	private static final Logger log = LoggerFactory.getLogger(Moto.class);

	public Tablet() {}
	
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
		log.info("La tablet está apagada");
	}

	@Override
	public void encender() {
		log.info("La tablet está encendida");
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		
	}
}
