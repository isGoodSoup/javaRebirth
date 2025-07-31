package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class MetodosEjercicio1 {
	
	static Scanner scan = new Scanner(System.in);
	static int option = 0;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println();
			System.out.println("1) Tabla de multiplicar\n2) Tabla(s) de multiplicar\n3) Salir");
			System.out.println("Introduce una opción");
			option = scan.nextInt();
			
			switch (option) {
			
			case 1: System.out.println("Introduce el número para su tabla: ");
					int num = scan.nextInt();
					
					tablaMultiplicar(num);
					break;
				
			case 2: System.out.println("Introduce el primer número: ");
					int num1 = scan.nextInt();
					
					System.out.println("Introduce el segundo número: ");
					int num2 = scan.nextInt();
					
					tablasMultiplicar(num1, num2);
					break;
					
			case 3: System.out.println("Adios!");
					System.exit(0);
					
			default: System.out.println("Opción inválida");
					 break;
			}
			
		} while (option != 4);
	}
	
	public static int tablaMultiplicar(int number) {
		
		for (int i = 1; i < 11; i++) {
			
			int result = number * i;
			System.out.println(number + "x" + i + "=" + result);
		}
		
		return number;
	}
	
	public static void tablasMultiplicar(int number1, int number2) {
		
		for (int i = number1; i <= number2; i++) {
			for (int j = 1; j < 11; j++) {
				
				int result = i * j;
				System.out.println(i + "x" + j + "=" + result);
			}
			System.out.println();
		}
	}
}
