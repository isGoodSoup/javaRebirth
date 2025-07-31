package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class TablasMultiplicar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean multiplosActivos = true;
        int count = 0;

        System.out.println("Introduce el número límite para la tabla:");
        int numero = scan.nextInt();

        while (multiplosActivos) {
            count += 1;

            for (int i = 1; i <= numero; i++) {

                System.out.println("Tabla del " + i);

                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + i*j);
                }

                System.out.println();
            }

            if (count==numero) {
                break;
            }
        }
    }
}
