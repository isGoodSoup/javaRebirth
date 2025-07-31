package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class StringsVocales {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta el string para contar sus vocales:");
        System.out.print("--> ");
        String string = scan.nextLine();

        int vowels = 0;

        for (int i = 0; i < string.length(); i++) {
            
            char ch = string.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Número de vocales: " + vowels);
    }
}
