package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarra extends Instrumento {
	private int numCuerdas;
	private final static Logger log = LoggerFactory.getLogger(Guitarra.class);
	
	public Guitarra() {
		
	}

	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}
	
	public void afinar() {
		if(!this.getAfinado()) {
			log.error("La guitarra no está afinada");
			super.afinar();
		} else {
			log.info("La guitarra está siendo afinada");
		}
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
}
