package es.cursojava.oo.interfaces.ejercicios.productos;

public class Baguette extends Alimentos {
	private String procedencia;
	
	public Baguette() {}
	
	public Baguette(String fechaCaducidad, String procedencia) {
		super(fechaCaducidad);
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		id.createId();
	}
}
