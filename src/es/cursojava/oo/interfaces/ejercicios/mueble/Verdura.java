package es.cursojava.oo.interfaces.ejercicios.mueble;

public abstract class Verdura implements Desinfectable {
	private String procedencia;

	public Verdura(String procedencia) {
		super();
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
}
