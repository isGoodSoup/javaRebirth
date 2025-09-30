package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class VehiculosMotorizado extends Vehiculo implements Encendible, Apagable {
	private int id;
	private String motor;
	
	public VehiculosMotorizado() {}
	
	public VehiculosMotorizado(String nombre, int numRuedas, double precio, int id, String motor) {
		super(nombre, numRuedas, precio);
		this.id = id;
		this.motor = motor;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
