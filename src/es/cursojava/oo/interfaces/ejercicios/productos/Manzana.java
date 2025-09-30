package es.cursojava.oo.interfaces.ejercicios.productos;

public class Manzana extends Alimentos {
	private String color;
	private String origen;
	
	public Manzana() {}
	
	public Manzana(int id, String fechaCaducidad, String color, String origen) {
		super(id, fechaCaducidad);
		this.color = color;
		this.origen = origen;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public void createId() {
		// TODO Auto-generated method stub
		
	}
}
