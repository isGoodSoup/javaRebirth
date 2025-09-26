package es.cursojava.oo.interfaces.ejercicios.mueble;

public class Mesa extends Mueble {
	private String forma;
	
	public Mesa(String color) {
		super(color);
	}

	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
	}
	
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
}
