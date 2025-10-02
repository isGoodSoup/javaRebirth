package es.cursojava.oo.interfaces.ejercicios.productos.vehiculos;

import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Capitalismo;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Encendible;
import es.cursojava.oo.interfaces.ejercicios.productos.main.Identificador;

public abstract class VehiculosMotorizado extends Vehiculo implements Encendible, Capitalismo {
	protected Identificador id = new Identificador();
	private String motor;
	
	public VehiculosMotorizado() {}
	
	public VehiculosMotorizado(String nombre, int numRuedas, double precio, String motor, int identificador) {
		super(identificador, nombre, numRuedas, precio);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
