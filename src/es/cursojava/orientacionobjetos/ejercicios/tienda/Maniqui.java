package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class Maniqui {
	
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui(int id) {
		this.id = id;
	}
	
	public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public Maniqui(int id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public void vestir(Camisa camisa) {
		desvestir();
		this.camisa = camisa;
	}
	
	public void vestir(Pantalon pantalon) {
		desvestir();
		this.pantalon = pantalon;
	}
	
	public void vestir(Vestido vestido) {
		desvestir();
		this.vestido = vestido;
	}

	public void desvestir() {
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
	}
}
