package es.cursojava.utils;

import java.util.Scanner;

public class Tools {
	
	static Scanner scan = new Scanner(System.in);

	public static int CalculaEdad(int edad) {
		
		int reply = 0;
		
		int currentYear = 2025;
		reply = currentYear - edad;
		return reply;
	}
	
	public static void printMenu(String[] menu) {
		
		for (int i = 0, j = 1; i < menu.length; i++, j++) {
			System.out.println(j + ") " + menu[i]);
		}
		System.out.println("Introduce una opción");
	}
	
	public static void printMenu(String[] texto, String cadena) {
		
		printMenu(texto);
		System.out.println(cadena);
	}
	
	public static int pideDatoNumerico(String texto) {
		
		System.out.println(texto);
		int num = scan.nextInt();
		
		return num;
	}
	
	public static int pideDatoNumerico(String texto, int num) {
		
		System.out.println(texto);
		return num;
	}
}
