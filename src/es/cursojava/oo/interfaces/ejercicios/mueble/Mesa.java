package es.cursojava.oo.interfaces.ejercicios.mueble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mesa extends Mueble implements Limpiable {
	private String forma;
	private static final Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());

	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
	}
	
	@Override
	public void limpiar() {
		log.info("La mesa " + this.forma + " se está limpiando");
	}
	
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
}
