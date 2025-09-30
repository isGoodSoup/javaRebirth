package es.cursojava.oo.interfaces.ejercicios.pagos;

public abstract class Pagos implements Pago {
	private int id;

	public Pagos() {}
	
	public Pagos(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
