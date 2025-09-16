package es.cursojava.oo.herencia.ejercicios.banda;

public class Tambor extends Instrumento{
	private String material;
	
	public Tambor() {
		
	}

	public Tambor(String material) {
		super();
		this.material = material;
	}
	
	public void afinar() {
		
	}
	
	public void aporrear() {
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
