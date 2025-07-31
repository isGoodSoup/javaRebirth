package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsInvertido {
    
    public static void main( String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta la cadena que deseas invertir:");
        String cadena = scan.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
