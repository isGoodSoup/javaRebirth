package es.java.juegos.ejercicios;

import java.util.Random;
import java.util.Scanner;

import es.cursojava.utils.Menu;

public class PiedraPapelTijera {
	
	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);
	static int prompt, pointsPlayer, pointsMachine;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("PIEDRA, PAPEL O TIJERA?");
			String[] menu = {"Piedra", "Papel", "Tijera", "Puntuación", "Salir"};
			Menu.printMenu(menu);
			prompt = scan.nextInt();
			scan.nextLine();
			
			switch (prompt) {
				case 1: playerChoice("Piedra");
						break;
					
				case 2: playerChoice("Papel");
						break;
						
				case 3: playerChoice("Tijera");
						break;
				
				case 4: showPoints();
						break;
						
				case 5: System.out.println("Resumen: ");
						showPoints();
						System.out.println("Adios!");
						System.exit(0);
						break;
				
				default: System.err.println("Opción inválida");
						 break;
			}
			
		} while (prompt != 5);
	}
	
	public static void playerChoice(String input) {
		
		String reply = "";
		
		if (input.equals("Piedra")) {
			
			reply = machineReply("Piedra");
			
			if (reply.equals("Piedra")) { statusMessage(3); }
			if (reply.equals("Papel")) { statusMessage(2); }
			if (reply.equals("Tijera")) { statusMessage(1); }
		}
		
		if (input.equals("Papel")) {
			
			reply = machineReply("Papel");
			
			if (reply.equals("Piedra")) { statusMessage(1); }
			if (reply.equals("Papel")) { statusMessage(3); }
			if (reply.equals("Tijera")) { statusMessage(2); }
		}
		
		if (input.equals("Tijera")) {
			
			reply = machineReply("Tijera");
			
			if (reply.equals("Piedra")) { statusMessage(2); }
			if (reply.equals("Papel")) { statusMessage(1); }
			if (reply.equals("Tijera")) { statusMessage(3); }
		}
	}
	
	public static String machineReply(String input) {
		
		String[] choices =  {"Piedra", "Papel", "Tijera"};
		
		int num = random.nextInt(3);
		String machineChoice = choices[num];
		input = machineChoice;
		System.out.println("Máquina: " + input);
		
		return input;
	}
	
	public static void statusMessage(int message) {
		
		switch (message) {
		
			case 1: System.out.println("Victoria. +3 Jugador");
					pointsPlayer += 3;
					showPoints();
					break;
					
			case 2: System.out.println("Derrota. +3 Máquina");
					pointsMachine += 3;
					showPoints();
					break;
					
			case 3: System.out.println("Empate! +1");
					pointsPlayer++; pointsMachine++;
					showPoints();
					break;
					
		}
	}
	
	public static void showPoints() {
		System.out.println("Jugador: " + pointsPlayer + " | " + "Máquina: " + pointsMachine);
	}
}
