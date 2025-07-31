package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class BucleDoWhile {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String respuesta = "";
        int contador = 0;

        do {
            /* El código se ejecuta más de una vez,
            sólo si la condición se cumple. */
            System.out.println("Hola");
            Scanner scan = new Scanner(System.in);
            System.out.println("Quieres continuar?");
            respuesta = scan.nextLine();
//          Se decide si el bucle continúa o no.

            contador++;
            
            if (contador == 2) {
                break;
            }

        } while (respuesta.equals("si"));
//          En el caso contrario se cumple una vez.
        System.out.println("Termina");
    }
}
