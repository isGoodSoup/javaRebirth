package es.cursojava.oo.interfaces.ejercicios.mueble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JudiasVerdes extends Verdura implements Desinfectable {
	private boolean tieneVaina;
	private static final Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());
	
	public JudiasVerdes(String procedencia, boolean tieneVaina) {
		super(procedencia);
		this.tieneVaina = tieneVaina;
	}

	public boolean isTieneVaina() {
		return tieneVaina;
	}

	public void setTieneVaina(boolean tieneVaina) {
		this.tieneVaina = tieneVaina;
	}

	@Override
	public void desinfectar() {
		log.info("Las judías de " + this.getProcedencia() + "están siendo desinfectadas");
	}

	@Override
	public void limpiar() {
		
	}
}
