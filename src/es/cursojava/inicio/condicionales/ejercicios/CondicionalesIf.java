package es.cursojava.inicio.condicionales.ejercicios;

public class CondicionalesIf {

	public static void main( String[] args ) {
		
		int numero = (int) (Math.random()*10);
		System.out.println(numero);
		
//		if (numero>5) {
//			System.out.println("El número " + numero + " es mayor que 5.");
//		} else if (numero>5 && numero<7) {
//			System.out.println("El número " + numero + " es mayor que 5 y menor de 7");
//		} else if (numero>2 || numero<5) {
//			System.out.println("El número " + numero + " es mayor que 2 o que 5");
//		} else {
//			System.out.println("El número " + numero + " es menor que 5.");
//		}
		
		if (numero%2==0) {
			System.out.println("El " + numero + " es par.");
		} else {
			System.out.println("El " + numero + " es impar.");
		}
	}
	
}
