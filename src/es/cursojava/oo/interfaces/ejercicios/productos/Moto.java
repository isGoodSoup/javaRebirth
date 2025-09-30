package es.cursojava.oo.interfaces.ejercicios.productos;

public class Moto extends VehiculosMotorizado {
	private String marca;
	
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

	}

	@Override
	public void apagar() {
			
	}
}
