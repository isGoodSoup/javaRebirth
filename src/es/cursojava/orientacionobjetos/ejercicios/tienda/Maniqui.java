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
	
	public Maniqui(Vestido vestido) {
		this.vestido = vestido;
	}
	
	public void maniquiVestir(Camisa camisa, Pantalon pantalon, Vestido vestido) {
		this.maniquiVestir(camisa, pantalon, vestido);
	}
	
	public void maniquiDesvestir(Camisa camisa, Pantalon pantalon, Vestido vestido) {
		this.maniquiDesvestir(camisa, pantalon, vestido);
	}
}
