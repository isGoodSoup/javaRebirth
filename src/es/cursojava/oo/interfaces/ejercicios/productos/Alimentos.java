package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Alimentos extends Producto implements Capitalismo {
	private int id;
	private String fechaCaducidad;
	
	public Alimentos() {}

	public Alimentos(int id, String fechaCaducidad) {
		super();
		this.id = id;
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
