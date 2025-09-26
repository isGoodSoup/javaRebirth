package es.cursojava.oo.interfaces.ejercicios.mueble;

public class Silla extends Mueble {
	private String material;
	
	public Silla(String color) {
		super(color);
	}

	public Silla(String color, String material) {
		super(color);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
