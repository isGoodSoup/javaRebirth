package es.cursojava.oo.herencia.ejercicios.banda;

public class GuitarraElectrica extends Instrumento {
	private int potencia;
	
	public GuitarraElectrica() {
		
	}

	public GuitarraElectrica(int potencia) {
		super();
		this.potencia = potencia;
	}
	
	public void tocar() {
		
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
