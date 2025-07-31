package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {

	@SuppressWarnings("resource")
	public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu calle:");
		String calle = scan.nextLine();
		
		System.out.println("Introduce tu número de calle:");
		int numero = scan.nextInt();
		
		System.out.println("Introduce tu población:");
		// Scanner scan = new Scanner(System.in);
		String poblacion = scan.nextLine();
		
		boolean esCalleGrande = numero > 100;
		
		System.out.println(poblacion + ", " + calle + " " + numero);
		
		System.out.println("La calle es grande: " + esCalleGrande);
		
		double random = Math.random();
		System.out.println(random);
		float limite = 0.5f;
		
		boolean randomMayorQue = random > limite;
		System.out.println(randomMayorQue);
		
//		System.out.println(numero%2==0);
		
//		System.out.println(numero);
//		numero +=1;
//
//		System.out.println(numero);
//		numero = numero + 1;
//
//		System.out.println(numero++);
//		System.out.println(numero);

		
		
	}
	
}
