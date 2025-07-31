package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BucleFibonnacci {

    @SuppressWarnings("resource")
    public static void main( String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scan.nextInt();
        
        int a = 0, b = 1;
        int suma = 0;

        for (int i = 0; i < numero; i++) {

            System.out.print(a + " ");         
            
            suma = a + b;
            a = b;
            b = suma;
        }
    }
}