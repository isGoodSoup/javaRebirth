package es.cursojava.oo.interfaces.ejercicios.mueble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lechuga extends Verdura implements Desinfectable {
	private String tipo;
	private static final Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());
	
	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo = tipo;
	}

	public Lechuga(String procedencia) {
		super(procedencia);
	}

	@Override
	public void desinfectar() {
		log.info("La lechuga de " + this.getProcedencia() + " está siendo desinfectada");
	}

	@Override
	public void limpiar() {
		log.info("La lechuga se está limpiando");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
