package es.java.juegos.ejercicios;

import java.util.Random;
import java.util.Scanner;
import es.cursojava.utils.Tools;

public class PiedraPapelTijera {
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	static int option;
	static int points;
	
	public static void main(String[] args) {
		
		System.out.println("Piedra, papel o tijera?");
		String[] menu = {"Piedra", "Papel", "Tijera", "Puntuación", "Salir"};
		Tools.printMenu(menu);
		option = scan.nextInt();
		scan.nextLine();
		
		do {
			
			switch (option) {
				case 1: 
						
						break;
					
				case 2: 
						
						break;
						
				case 3: 
					
						break;
				
				case 4: 
					
						break;
						
				case 5: System.out.println("Adios!");
						System.exit(0);
						break;
				
				default: System.err.println("Opción inválida");
						 break;
			}
			
			int randomNumber = random.nextInt(100) + 1;
			
			if (randomNumber > 10 && randomNumber < 30) {
				
			}
			
			if (randomNumber >= 30 && randomNumber < 60) {
				
			}
			
			if (randomNumber >= 60 && randomNumber < 100) {
				
			}
			
		} while (option != 6);
	}
}
