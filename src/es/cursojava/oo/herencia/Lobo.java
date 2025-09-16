package es.cursojava.oo.herencia;

public class Lobo extends Animal {
	private int numColmillos;
	
	public Lobo() {
		
	}

	public Lobo(String nombre, double peso, long id) {
		super(nombre, peso, id);
	}

	public Lobo(int numColmillos) {
		super();
		this.numColmillos = numColmillos;
	}
	
	public void comer() {
		System.out.println("El lobo está cazando");
		super.comer();
	}

	public int getNumColmillos() {
		return numColmillos;
	}

	public void setNumColmillos(int numColmillos) {
		this.numColmillos = numColmillos;
	}
}
