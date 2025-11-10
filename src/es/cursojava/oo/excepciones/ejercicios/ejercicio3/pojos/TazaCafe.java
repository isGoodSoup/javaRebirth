package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

public class TazaCafe {
	private String tipo;
	private double temperatura;
	
	public TazaCafe(String tipo, double temperatura) {
		super();
		this.tipo = tipo;
		this.temperatura = temperatura;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}
