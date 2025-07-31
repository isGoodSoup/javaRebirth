package es.cursojava.inicio.condicionales.ejercicios;

public class EsParImpar {
	
		public static void main( String[] args ) {
			
			int numero = (int) (Math.random()*10);
			System.out.println(numero);
			
			if (numero%2==0) {
				System.out.println("El " + numero + " es par.");
			} else {
				System.out.println("El " + numero + " es impar.");
			}
		}
}
