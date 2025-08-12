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
