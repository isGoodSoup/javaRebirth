package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable {
	private int id;
	private String fechaFabricacion;

	public ProductosElectronicos(int id, String fechaFabricacion) {
		super();
		this.id = id;
		this.fechaFabricacion = fechaFabricacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
}
