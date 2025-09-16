package es.cursojava.orientacionobjetos.herencia;

public class Zoologico {
	
	public static void main(String[] args) {
		Vaca vaca = new Vaca("Wendolin", 500, 2, 2);
		Lobo lobo = new Lobo("Miguel", 50, 222);
		lobo.comer();
	}
}
