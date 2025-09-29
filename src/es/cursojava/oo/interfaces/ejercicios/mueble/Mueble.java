package es.cursojava.oo.interfaces.ejercicios.mueble;

public abstract class Mueble implements Limpiable {
	private String color;

	public Mueble(String color) {
		super();
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public abstract void limpiar();
}
