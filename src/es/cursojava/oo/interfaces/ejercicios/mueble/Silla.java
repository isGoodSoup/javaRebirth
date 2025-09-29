package es.cursojava.oo.interfaces.ejercicios.mueble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Silla extends Mueble implements Limpiable {
	private String material;
	private static final Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());

	public Silla(String color, String material) {
		super(color);
		this.material = material;
	}
	
	@Override
	public void limpiar() {
		log.info("La silla de " + this.material + " está siendo limpiada");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
