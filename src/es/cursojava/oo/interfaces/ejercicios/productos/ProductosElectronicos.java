package es.cursojava.oo.interfaces.ejercicios.productos;

public abstract class ProductosElectronicos extends Producto implements Encendible, Capitalismo {
	protected Identificador id = new Identificador();
	private String fechaFabricacion;
	
	public ProductosElectronicos() {}
	
	public ProductosElectronicos(String fechaFabricacion) {
		super();
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
}
