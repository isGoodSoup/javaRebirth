package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class Alimentos extends Producto {
	private String fechaCaducidad;

	public Alimentos(String nombre, double precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
}
