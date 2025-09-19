package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarra extends Instrumento {
	private int numCuerdas;
	private final static Logger log = LoggerFactory.getLogger(Guitarra.class);
	
	public Guitarra() {
		
	}

	public Guitarra(int numCuerdas) {
		super();
		this.numCuerdas = numCuerdas;
	}
	
	public void afinar() {
		Instrumento instrumento = new Instrumento();
		log.info("La guitarra está siendo afinada");
		instrumento.afinar();
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
}
