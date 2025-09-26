package es.cursojava.oo.interfaces.ejercicios.mueble;

public class JudiasVerdes extends Verdura {
	private boolean tieneVaina;
	
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
		
	}

	@Override
	public void limpiar() {
		
	}
}
