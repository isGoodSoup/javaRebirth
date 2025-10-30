package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsPalindromo_V2 {
	private static Scanner scan = new Scanner(System.in);
	private String cadena;
	private String cadena_reverso;
	private String mensaje;
	private boolean esPalindromo;
	
    public void palindromo() {
        System.out.println("Introduce el String,");
        cadena = scan.nextLine();
        for (int i = cadena.length() - 1; i >= 0; i--) {
        	cadena_reverso += cadena.charAt(i);
        }
        
        esPalindromo = cadena.equalsIgnoreCase(cadena_reverso);
        if (esPalindromo) {
            mensaje += cadena + " Es un palíndromo";
        } else {
        	mensaje += cadena + " NO es un palíndromo";
        }
        System.out.println(mensaje);
    }
}
