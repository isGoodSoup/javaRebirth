package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class Maniqui {
	
	private String id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui() {
		
	}
	
	public Maniqui(String id, Camisa camisa, Pantalon pantalon) {
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public Maniqui(String id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	
	public String getID() {
		return id;
	}

	public void setID(String id) {
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

	public void maniquiVestir(Camisa camisa) {
		this.camisa = camisa;
	}
	
	public void maniquiVestir(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	
	public void maniquiVestir(Vestido vestido) {
		this.vestido = vestido;
	}

	public void maniquiDesvestir(Camisa camisa, Pantalon pantalon, Vestido vestido) {
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
	}
}
