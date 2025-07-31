package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class CollatzConjentura {

    @SuppressWarnings("resource")
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta el número en cuestión:");
        int numero = scan.nextInt();

        while (numero != 1) { 
            System.out.println(numero);

            if (numero%2==0) {
                numero /= 2;
            } else {
                numero *= 3;
                numero += 1;
            }
        }
        System.out.println("Resultado final: " + numero);
    }
}
