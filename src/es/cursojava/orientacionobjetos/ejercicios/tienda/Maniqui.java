package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class Maniqui {
	
	private String id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	public Maniqui() {
		
	}
	
	public Maniqui(Camisa camisa, Pantalon pantalon) {
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public Maniqui(Vestido vestido) {
		this.vestido = vestido;
	}
	
	public void maniquiVestir(Vestido vestido, boolean estaVestido) {
		
	}
}
