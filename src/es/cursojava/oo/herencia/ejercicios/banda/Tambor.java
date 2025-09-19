package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tambor extends Instrumento{
	private String material;
	private final static Logger log = LoggerFactory.getLogger(Tambor.class);
	
	public Tambor() {
		
	}

	public Tambor(String material) {
		super();
		this.material = material;
	}
	
	public void afinar() {
		Instrumento instrumento = new Instrumento();
		log.info("El tambor está siendo afinado");
		instrumento.afinar();
	}
	
	public void aporrear() {
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
