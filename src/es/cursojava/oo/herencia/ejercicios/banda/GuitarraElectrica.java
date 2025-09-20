package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuitarraElectrica extends Instrumento {
	private int potencia;
	private final static Logger log = LoggerFactory.getLogger(GuitarraElectrica.class);
	
	public GuitarraElectrica() {
		
	}

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int potencia) {
		super(nombre, tipo, afinado);
		this.potencia = potencia;
	}
	
	public void tocar() {
		log.info("La guitarra eléctrica está tocando");
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
