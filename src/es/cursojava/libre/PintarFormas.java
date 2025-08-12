package es.cursojava.libre;

import java.util.Scanner;

import es.cursojava.utils.Menu;

public class PintarFormas {
	
	static Scanner scan = new Scanner(System.in);
	static int option;
	static String cell = "*";
	
	public static void main(String[] args) {
		
		do {
			System.out.println("Pintar: ");
			String[] menu = {"Circulo", "Cuadrado", "Triángulo", "Salir"};
			Menu.printMenu(menu);
			option = scan.nextInt();
			scan.nextLine();
			
			switch (option) {
			
				case 1: System.out.println("Diámetro del círculo: ");
						int diameter = scan.nextInt();
						
						printCircle(diameter);
						break;
						
				case 2: System.out.println("Tamaño del cuadrado: ");
						int size = scan.nextInt();
						
						printSquare(size);
						break;
						
				case 3: System.out.println("Longitud del triángulo: ");
						int length = scan.nextInt();
						
						System.out.println("Altura del triángulo: ");
						int height = scan.nextInt();
						
						printTriangle(length, height);
						break;
						
				case 4: System.out.println("Adios!!");
						System.exit(0);
	
				default: System.err.println("Opción inválida");
						 break;
			}
		} while (option != 5);
	}
	
	public static void printCircle(int size) {
		
		int[][] circle = new int[size][size];
		
		int center = size / 2;
		double radius = (size - 1) / 2;
		
		for (int i = 0; i < circle.length; i++) {
			for (int j = 0; j < circle[i].length; j++) {
				
				double dx = j - center;
				double dy = i - center;
				double distanceSquare = dx * dx + dy * dy;
				
//				if (distanceSquare >= (radius - 0.5) * (radius - 0.5) && distanceSquare <= (radius + 0.5) * (radius + 0.5)) {
				if (distanceSquare <= (radius + 0.5) * (radius + 0.5)) {
					System.out.print(cell + " ");
		        } else {
		        	System.out.print("  ");
		        }
				
			}
			System.out.println();
		}
		
	}
	
	public static void printSquare(int size) {
		
		boolean isPrinterActive = true;
		int count = 0;
		
		while (isPrinterActive) {
			
			if (count == size) {
				break;
			}
			
			count += 1;
			
			for (int i = 0; i < size; i++) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void printTriangle(int base, int height) {
		
//		int[][] triangleGrid = new int[base][height];
//		double h = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
//		
//		for (int i = 0; i < triangleGrid.length; i++) {
//			for (int j = 0; j < triangleGrid[i].length; j++) {
//				
//				
//			}
//		}
		
		for (int i = 1; i <= height; i++) {
			
	        int stars = (int) Math.round((double) (i * base) / height);
	        
	        for (int j = 0; j < stars; j++) {
	            System.out.print(cell + " ");
	        }
	        System.out.println();
	    }
	    System.out.println();
		
	}
}
