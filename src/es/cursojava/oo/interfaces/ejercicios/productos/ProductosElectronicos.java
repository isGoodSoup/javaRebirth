package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable {
	private String fechaFabricacion;

	public ProductosElectronicos(String nombre, double precio, String fechaFabricacion) {
		super(nombre, precio);
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
}
