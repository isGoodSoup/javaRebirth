package es.cursojava.oo.interfaces.ejercicios.productos;

public class Telefono extends ProductosElectronicos {
	private int numero;
	private String fabricaOrigen;

	public Telefono(int id, String fechaFabricacion, int numero, String fabricaOrigen) {
		super(id, fechaFabricacion);
		this.numero = numero;
		this.fabricaOrigen = fabricaOrigen;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getFabricaOrigen() {
		return fabricaOrigen;
	}
	
	public void setFabricaOrigen(String fabricaOrigen) {
		this.fabricaOrigen = fabricaOrigen;
	}

	@Override
	public void encender() {
		
	}

	@Override
	public void apagar() {
		
	}
}
