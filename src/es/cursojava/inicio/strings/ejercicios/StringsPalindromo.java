package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsPalindromo {

    public static void main( String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el String,");
        System.out.println("Y te digo si es un palíndromo:");
        String string = scan.nextLine();

        String stringReversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringReversed += string.charAt(i);
        }
        boolean isPalindrome = string.equalsIgnoreCase(stringReversed);

        System.out.println("=====================");

        if (isPalindrome) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        System.out.println("=====================");
    }
}
