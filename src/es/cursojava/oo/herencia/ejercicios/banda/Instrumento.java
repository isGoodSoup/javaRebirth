package es.cursojava.oo.herencia.ejercicios.banda;

public class Instrumento {
	private String nombre;
	private String tipo;
	private int afinado;
	
	public Instrumento() {
		
	}

	public Instrumento(String nombre, String tipo, int afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}
	
	public void afinar() {
		
	}
	
	public void tocar() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAfinado() {
		return afinado;
	}

	public void setAfinado(int afinado) {
		this.afinado = afinado;
	}
}
