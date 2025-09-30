package es.cursojava.oo.interfaces.ejercicios.productos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moto extends VehiculosMotorizado {
	private String marca;
	private static final Logger log = LoggerFactory.getLogger(Moto.class);
	
	public Moto() {}
	
	public Moto(String nombre, int numRuedas, double precio, int id, String motor, String marca) {
		super(nombre, numRuedas, precio, id, motor);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void encender() {
		log.info("La moto está encendida");
	}

	@Override
	public void apagar() {
		log.info("La moto está apagada");
	}
}
