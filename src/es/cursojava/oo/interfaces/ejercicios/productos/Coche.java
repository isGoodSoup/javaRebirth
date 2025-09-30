package es.cursojava.oo.interfaces.ejercicios.productos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coche extends VehiculosMotorizado {
	private String marca;
	private int numPuertas;
	private static final Logger log = LoggerFactory.getLogger(Coche.class);
	
	public Coche() {}
	
	public Coche(String nombre, int numRuedas, double precio, String motor, String marca, int numPuertas) {
		super(nombre, numRuedas, precio, motor);
		this.marca = marca;
		this.numPuertas = numPuertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public void encender() {
		log.info("El coche se ha encendido");
	}

	@Override
	public void apagar() {
		log.info("El coche se ha apagado");
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		id.createId();
	}
}
