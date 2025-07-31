package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsValidarEmail {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		int atCount = 0;
		boolean isThereAt = false, isThereSpaces = false, isTherePeriod = false;

		do {
			System.out.println("Introduce tu email:"); System.out.print("-- ");
			String email = scan.nextLine();
			
			email = email.trim();
			
			if (email.equals("quit")) {
				break;
			}

			for (int i = 0; i < email.length(); i++) {
				
				char ch = email.charAt(i);

				if (ch == ' ') {

					isThereSpaces = true;
					System.out.println("El email no puede contener espacios en blanco");
					break;
				}
			}	

			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '@') {
					atCount++;
				}
			}

			if (atCount == 1) {
				System.out.println("El email tiene una arroba");
				isThereAt = true;
			} else {
				System.out.println("El email tiene más de una arroba");
			}

			if (isThereAt) {
				
				int atPos = email.indexOf('@');
				if (atPos + 2 < email.length() && email.indexOf('.', atPos + 2) != -1) {
					
					isTherePeriod = true;
					System.out.println("El email tiene un punto");

				} else {
					System.out.println("El email no tiene un punto");
				}
			}
			
			

		} while (isThereSpaces || !isThereAt || !isTherePeriod);
			
		System.out.println();
		System.out.println(">> El email ha sido validado");
	}
}
