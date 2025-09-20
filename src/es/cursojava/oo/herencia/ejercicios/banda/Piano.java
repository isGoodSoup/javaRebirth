package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Piano extends Instrumento{
	private int numOctavas;
	private String tipoPiano;
	private final static Logger log = LoggerFactory.getLogger(Piano.class);
	
	public Piano() {
		
	}

	public Piano(String nombre, String tipo, boolean afinado, int numOctavas, String tipoPiano) {
		super(nombre, tipo, afinado);
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}
	
	public void afinar() {
		if(!this.getAfinado()) {
			log.error("El piano no está afinado");
			super.afinar();
		} else {
			log.info("El piano está siendo afinado");
		}
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
