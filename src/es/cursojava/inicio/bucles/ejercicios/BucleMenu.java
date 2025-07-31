package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BucleMenu {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        System.out.println("Seleccione una de las 4 opciones:");
		System.out.println("1-- Pintar cuadrado");
		System.out.println("2-- Validar email");
		System.out.println("3-- Añadir Alumno");
		System.out.println("4-- Salir");
		
		Scanner scan = new Scanner(System.in);
		
		int opcion = 1;

        switch (opcion) {
            case 1 -> {
                System.out.println("Pintando cuadrado...");
                System.out.println("Tamaño del cuadrado?");
                int width = scan.nextInt();
                System.out.println("Tamaño seleccionado: " + width);
                
                System.out.println();
                
                boolean isPrinterActive = true;
                int count = 0;
                String cell = "*";
                
                while (isPrinterActive) {
                    
                    if (count == width) {
                        break;
                    }
                    
                    count += 1;
                    for (int i = 0; i < width; i++) {
                        if (count == 1 || count == width || i == 0 || i == width - 1) {
                            System.out.print(cell);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                System.out.println("[] Validando email...");
                System.out.println("Email entrado ya validado.");
            }
            case 3 -> {
                System.out.println("Añadir alumno: ");
                String alumno = scan.nextLine();
                System.out.println(alumno + " queda registrado.");
            }
            case 4 -> System.out.println("Saliendo");
            default -> System.out.println("Operación inválida.");
        }
    }
}
