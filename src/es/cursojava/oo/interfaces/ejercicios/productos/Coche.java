package es.cursojava.oo.interfaces.ejercicios.productos;

public class Coche extends VehiculosMotorizado {
	private String marca;
	private int numPuertas;
	
	public Coche() {}
	
	public Coche(String nombre, int numRuedas, double precio, int id, String motor, String marca, int numPuertas) {
		super(nombre, numRuedas, precio, id, motor);
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
		
	}

	@Override
	public void apagar() {
			
	}
}
