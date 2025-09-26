package es.cursojava.oo.interfaces.ejercicios.mueble;

public class Lechuga extends Verdura {
	private String tipo;
	
	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo = tipo;
	}

	public Lechuga(String procedencia) {
		super(procedencia);
	}

	@Override
	public void desinfectar() {
		
	}

	@Override
	public void limpiar() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
