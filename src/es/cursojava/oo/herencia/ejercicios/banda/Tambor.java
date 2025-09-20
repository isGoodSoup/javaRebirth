package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tambor extends Instrumento{
	private String material;
	private final static Logger log = LoggerFactory.getLogger(Tambor.class);
	
	public Tambor() {
		
	}

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, afinado);
		this.material = material;
	}
	
	public void afinar() {
		log.info("El tambor está siendo afinado");
	}
	
	public void tocar() {
		aporrear();
	}
	
	public void aporrear() {
		log.info("El tambor está siendo aporreado");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
