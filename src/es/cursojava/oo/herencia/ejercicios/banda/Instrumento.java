package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Instrumento {
	private String nombre;
	private String tipo;
	private boolean afinado;
	private final static Logger log = LoggerFactory.getLogger(Instrumento.class);
	
	public Instrumento() {
		
	}

	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}
	
	public void afinar() {
		if (this.afinado) {
			log.info("El instrumento " + this.nombre + " ya está afinado.");
		} else {
			log.warn("El instrumento " + this.nombre + " no está afinado. Afinando...");
			this.afinado = true;
			log.info("El instrumento " + this.nombre + " ha sido afinado.");
		}
	}

	
	public void tocar() {
		log.info("El instrumento, " + this.getNombre() + " está tocando");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
}
