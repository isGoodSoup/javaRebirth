package es.cursojava.oo.interfaces.ejercicios.productos.vehiculos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Insertable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Updatable;

public class Coche extends VehiculosMotorizado implements Insertable, Updatable {
	private String marca;
	private int numPuertas;
	private static final Logger log = LoggerFactory.getLogger(Coche.class);
	
	public Coche() {}
	
	public Coche(String nombre, int numRuedas, double precio, String motor, String marca, int numPuertas, int identificador) {
		super(nombre, numRuedas, precio, motor, identificador);
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
