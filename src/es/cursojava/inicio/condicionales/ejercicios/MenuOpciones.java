package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class MenuOpciones {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seleccione una de las 4 opciones:");
		System.out.println("1-- Pintar cuadrado");
		System.out.println("2-- Validar email");
		System.out.println("3-- Añadir Alumno");
		System.out.println("4-- Salir");
		
		System.out.println("--------------------------------");
		int response = scan.nextInt();
		
//		if (response == 1) {
//			System.out.println("Pintando cuadrado...");
//			System.out.println("-----");
//			System.out.println("|    |");
//			System.out.println("|    |");
//			System.out.println("-----");
//		} else if (response == 2) {
//			System.out.println("Validando email...");
//		} else if (response == 3) {
			
//			System.out.println("Añadir nuevo alumno:");
//			String alumnoNuevo = scan.nextLine();
//			System.out.println("Nuevo alumno registrado: " + alumnoNuevo);
			
//		} else if (response == 4) {
//			System.out.println("Saliendo...");
//		} else {
//			System.out.println("Respuesta no válida.");
//		}
		// Switch Tradicional
		switch (response) {
			case 1 : System.out.println("Pintando cuadrado... □"); break;
			case 2 : System.out.println("Validando email."); break;
			case 3 : System.out.println("Nuevo alumno"); 
					 String alumnoNuevo = scan.nextLine(); 
					 System.out.println("Nuevo alumno [" + alumnoNuevo + "] registrado."); break; 
			case 4 : System.out.println("Saliendo"); break;
		}
	}
}
