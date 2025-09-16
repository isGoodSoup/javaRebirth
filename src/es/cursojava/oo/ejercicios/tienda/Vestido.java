package es.cursojava.oo.ejercicios.tienda;

public class Vestido {
	
	private String color;
	private double precio;
	private int talla;
	
	public Vestido() {
		
	}
	
	public Vestido(String color, int precio, int talla) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getTalla() {
		return talla;
	}
	
	public void setTalla(int talla) {
		this.talla = talla;
	}
}
