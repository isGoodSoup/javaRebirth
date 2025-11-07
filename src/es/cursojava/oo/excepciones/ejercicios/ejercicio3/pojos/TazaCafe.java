package es.cursojava.oo.excepciones.ejercicios.ejercicio3.pojos;

public class TazaCafe {
	private String tipo;
	private float temperatura;
	
	public TazaCafe(String tipo, float temperatura) {
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
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
}
