package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class MenuOpcionesAlt {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		System.out.println("Seleccione una de las 4 opciones:");
		System.out.println("1-- Pintar cuadrado");
		System.out.println("2-- Validar email");
		System.out.println("3-- Añadir Alumno");
		System.out.println("4-- Salir");
		
		Scanner scan = new Scanner(System.in);
		
		int opcion = scan.nextInt();
			
		// Switch nuevo
		switch (opcion) {
			case 1 -> System.out.println("Pintando... □");
			case 2 -> System.out.println("Validando Email...");
			case 3 -> {
				// Si queremos meter varios comandos debemos añadir llaves.
				System.out.println("Nuevo alumno:");
				String alumnoNuevo = scan.nextLine();
				System.out.println("El alumno, " + alumnoNuevo + " ha sido registrado");
			}
			case 4 -> System.out.println("Saliendo. ->");
			default -> System.out.println("Opción inválida");
		}
	}
}
