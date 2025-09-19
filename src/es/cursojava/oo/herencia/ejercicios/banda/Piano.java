package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Piano extends Instrumento{
	private int numOctavas;
	private String tipoPiano;
	private final static Logger log = LoggerFactory.getLogger(Piano.class);
	
	public Piano() {
		
	}

	public Piano(int numOctavas, String tipoPiano) {
		super();
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}
	
	public void afinar() {
		Instrumento instrumento = new Instrumento();
		log.info("El piano está siendo afinado");
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
