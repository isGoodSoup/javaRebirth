package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class AlumnosNotaMedia {
    @SuppressWarnings("resource")
    
    public static void main(String[] args) {

        //Alumnado
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el total de alumnado:");
        int alumnos = scan.nextInt();
        int count = 0;
        int totalNotas = 0;

        while(true) {
            count += 1;

            if (count==alumnos) {
                break;
            }

            //Nota (Aleatoria)
            double nota = Math.random() * 10;
            System.out.println(count + ", " + nota);
            totalNotas += nota;
        }
        // Media
        System.out.println("Media: " + totalNotas / alumnos);
        
    }
}
