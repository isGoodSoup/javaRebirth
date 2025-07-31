package es.cursojava.metodos.ejercicios;

import java.util.Scanner;
import es.cursojava.utils.Tools;

public class MetodosEjercicio5 {
	
	static Scanner scan = new Scanner(System.in);
	static int option;
	
	public static void main(String[] args) {
		
		do {
			
			String[] menu = {"Pintar cuadrado", "Validar email", "Alumnos", "Salir"};
			Tools.printMenu(menu);
			option = scan.nextInt();
			scan.nextLine();
			
			switch (option) {
				
				case 1: System.out.println("Pintando cuadrado...");
				 		System.out.println("Tamaño del cuadrado?");
						int size = scan.nextInt();
						printSquare(size);
						break;

				case 2: System.out.println("Validando email...");
						String email = scan.nextLine();
						validateEmail(email);
						break;

				case 3:	System.out.println("Menu de alumnos");
						studentsMenu();
						break;

				case 4:	System.out.println("Adiós");
						break;

				default: System.out.println("Opción inválida");
						 break;
			}
		} while (option > 4);
	}

	public static void printSquare(int size) {

		System.out.println("Tamaño seleccionado: " + size);
        System.out.println();

        boolean isPrinterActive = true;
        int count = 0;
        String cell = "*";
                
        while (isPrinterActive) {
                    
			if (count == size) {
				break;
			}
						
			count += 1;
			for (int i = 0; i < size; i++) {
				if (count == 1 || count == size || i == 0 || i == size - 1) {
					System.out.print(cell);
				} else {
					System.out.print(" ");
				}						
			}
			System.out.println();
        }
		System.out.println();
	}

	public static void validateEmail(String email) {

		String error = "";

		do {
			if (email.contains(" ")) {
				error += "El email no puede tener espacios\n";
			}
			if (!email.contains("@")) {
				error += "El email no tiene arroba\n";
			} else if (email.indexOf("@")!=email.lastIndexOf("@")) {
				error += "El email no puede tener más de una arroba\n";
			} else {
				
				String domain = email.substring(email.indexOf("@") + 1);
				System.out.println("dominio: " + domain);
			
				if (!domain.contains(".")) {
					error += "El dominio del email debe contener al menos un punto\n";
				} else {
					
					int periodPos = domain.indexOf(".");
					if (periodPos < 2) {
						error += "La separación entre el @ y el punto debe ser (al menos) de 2 caracteres\n";
					}
					
					int periodPosFinal = domain.lastIndexOf(".");
					int domainLength = domain.length() - 1;
					if (domainLength - periodPosFinal < 2 || domainLength - periodPosFinal > 6 ) {
						error += "Después del último punto debe haber entre 2 y 6 caracteres\n";
					}
					
				}
			}
			
			if (error.isEmpty()) {
				
				System.out.println("El email " + email + " es válido");
				break;
				
			} else {
				
				System.out.println(error);
				break;
			}
			
		} while (true);
	}

	public static void studentsMenu() {

		String [][] class1 = new String[2][3];
		
		do {

			String[] menu = {"Insertar Alumno", "Mostrar Alumnos", "Buscar Alumno", "Borrar Alumno", "Salir"};

			Tools.printMenu(menu);
			option = scan.nextInt();
			scan.nextLine();
			
			switch (option) {
			
				case 1: boolean areThereSpots = false;
						for (int i = 0; i < class1.length; i++) {
					
							for (int j = 0; j < class1[i].length; j++) {
								
								if (class1[i][j] == null) {
									
									System.out.println("Nombre de alumno: ");
									String name = scan.nextLine();
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
						String search = scan.nextLine();
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
						String nameDelete = scan.nextLine();
						
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
