package es.cursojava.oo.herencia.ejercicios.banda;

public class Piano extends Instrumento{
	private int numOctavas;
	private String tipoPiano;
	
	public Piano() {
		
	}

	public Piano(int numOctavas, String tipoPiano) {
		super();
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}
	
	public void afinar() {
		Instrumento instrumento = new Instrumento("Piano", "piano", true);
		instrumento.afinar();
		
	}

	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}
}
