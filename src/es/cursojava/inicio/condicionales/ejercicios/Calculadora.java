package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Calculadora {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		int firstNumber = scan.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int secondNumber = scan.nextInt();
		
		System.out.println("Introduzca la operación a continuación:");
		String operacion = scan.nextLine();
		
		//String operacion1 = "suma";
		//String operacion2 = "resta";
		//String operacion3 = "mult";
		//String operacion4 = "division";

		// operacion.equals(operacion1) <-- Forma correcta
		// operacion == operacion1 		<-- Incorrecta

		int resultado = 0;
		if (operacion.equals("+") || operacion.equalsIgnoreCase("suma")) 
		{ resultado = firstNumber + secondNumber; } 
		
		else if (operacion.equals("-") || operacion.equalsIgnoreCase("resta")) { resultado = firstNumber - secondNumber; } 
		
		else if (operacion.equals("*") || operacion.equalsIgnoreCase("mult")) 
		{ resultado = firstNumber * secondNumber; } 
			
		else if (operacion.equals("/") || operacion.equalsIgnoreCase("divide")) 
		{ resultado = firstNumber / secondNumber; } 
		
		else {
			System.out.println("Operación no permitida.");
		}

		
	}
}
