package es.cursojava.oo.interfaces.ejercicios.productos;

public class Baguette extends Alimentos {
	private String procedencia;
	
	public Baguette() {}
	
	public Baguette(int id, String fechaCaducidad, String procedencia) {
		super(id, fechaCaducidad);
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
}
