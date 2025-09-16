package es.cursojava.oo.ejercicios.tienda;

public class Boton {
	
	private String color;
	private int tamanho;
	private String forma;
	
	public Boton() {
		
	}
	
	public Boton(String color, int tamanho, String forma) {
		super();
		this.color = color;
		this.tamanho = tamanho;
		this.forma = forma;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getForma() {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
}
