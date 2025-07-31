package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class ArrayColegioAlumnos {
	
	static int option;
	
	public static void main( String[] args ) {

		String [][] class1 = new String[2][3];
		
		do {
			System.out.println("1. Insertar Alumno\n2. Mostrar Alumnos\n3. Buscar Alumno\n4. Borrar Alumno\n5. Salir");
			
			System.out.println("Inserta la acción: ");
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
			
			switch (option) {
			
				case 1: boolean areThereSpots = false;
						for (int i = 0; i < class1.length; i++) {
					
							for (int j = 0; j < class1[i].length; j++) {
								
								if (class1[i][j] == null) {
									
									System.out.println("Nombre de alumno: ");
									Scanner scan2 = new Scanner(System.in);
									String name = scan2.nextLine();
									name = name.trim();
									class1[i][j] = name;
									
									areThereSpots = true;
								}
							}
						}
						
						if (!areThereSpots) {
							System.out.println("No hay puestos libres\n");
						}
						
						break;
						
				case 2: System.out.println("Mostrando alumnos...");
						
						for (int i = 0; i < class1.length; i++) {
					
							for (int j = 0; j < class1[i].length; j++) {

								if (class1[i][j] == null) {
									System.out.println("vacío");
								} else {
									System.out.println(class1[i][j]);
								}
							}
						}
				
						break;
						
				case 3: System.out.println("Nombre de alumno: ");
						Scanner scan3 = new Scanner(System.in);
						String search = scan3.nextLine();
						search = search.trim();
						boolean noNameFound = false;
						
						for (int i = 0; i < class1.length; i++) {
							
							for (int j = 0; j < class1[i].length; j++) {
								
								do {
									
									if (class1[i][j] == null) {
										
										noNameFound = true;
									} else if (class1[i][j].contains(search)) {

										System.out.println("Alumno encontrado: " + class1[i][j] + " se encuentra en clase " + i + " y puesto " + j);
										break;
									}
									
								} while (class1[i][j] != null);
							}
						}
						
						if (noNameFound) {
							System.out.println("No hay ningún alumno con ese nombre");
						}
						
						break;
						
				case 4: System.out.println("Inserta el nombre del alumno");
						Scanner scan4 = new Scanner(System.in);
						String nameDelete = scan4.nextLine();
						
						for (int i = 0; i < class1.length; i++) {
					
							for (int j = 0; j < class1[i].length; j++) {
								
								if (class1[i][j] == null) {
									System.out.println("No hay ningún alumno con ese nombre");
									break;
								} else if (class1[i][j].equals(nameDelete)) {
									class1[i][j] = null;
								}
							}
						}
				
						break;
						
				case 5: System.out.println("Adios!"); 
						break;
						
				default: System.out.println("Opción inválida");
			}
			
		} while (option != 5);
	}

}
