package es.java.juegos.ejercicios;

import java.util.Scanner;

public class EcoEco {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Eco? ");
		String reply = scan.nextLine();
		
		dijoEco(reply);
	}
	
	public static void dijoEco(String texto) {
		
		System.out.println("Eco! " + texto);
	}
}
