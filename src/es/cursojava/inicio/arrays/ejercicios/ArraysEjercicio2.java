package es.cursojava.inicio.arrays.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ArraysEjercicio2 {

	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int [][] table = new int[4][4];
		
		for (int i = 0; i < table.length; i++) {
			
			for (int j = 0; j < table[i].length; j++) {
				
//				System.out.print("Introduce el valor: ");
//				int value = scan.nextInt();
				int value = random.nextInt(40);
				table[i][j] = value;
				
				if (i == j) {
					System.out.print("*" + table[i][j] + "\t");
					
				} else {
					System.out.print(table[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int n = 0; n < table.length/2; n++) {
			
			int aux = table[table.length - 1 - n][table.length - 1 - n];
			table[table.length - 1 - n][table.length - 1 - n] = table[n][n];
			table[n][n] = aux;
			System.out.print(aux + "\t");
		}
		
//		for (int[] fila : table) {
//			for (int value : fila) {
//				System.out.print(value + "\t");
//			}
//			System.out.println();
//		}
		
		
	}

}
