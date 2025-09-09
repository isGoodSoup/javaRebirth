package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class Pantalon {
	
	private String color;
	private double precio;
	private int talla;
	private Boton boton;
	
	public Pantalon() {
		
	}
	
	public Pantalon(String color, double precio, int talla, Boton boton) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.boton = boton;
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
	
	public Boton getBoton() {
		return boton;
	}
	
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
}
