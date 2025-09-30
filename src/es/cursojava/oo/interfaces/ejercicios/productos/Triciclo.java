package es.cursojava.oo.interfaces.ejercicios.productos;

public class Triciclo extends Bicicleta {
	private int numRuedas;
	private String color;
	
	public Triciclo() {}
	
	public Triciclo(String nombre, int numRuedas, double precio, int id, int numMarchas, int numRuedas2, String color) {
		super(nombre, numRuedas, precio, id, numMarchas);
		numRuedas = numRuedas2;
		this.color = color;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		
	}
}
