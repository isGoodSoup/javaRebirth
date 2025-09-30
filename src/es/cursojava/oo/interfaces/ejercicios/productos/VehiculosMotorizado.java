package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class VehiculosMotorizado extends Vehiculo {
	private String motor;

	public VehiculosMotorizado(String nombre, int numRuedas, double precio, String motor) {
		super(nombre, numRuedas, precio);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
