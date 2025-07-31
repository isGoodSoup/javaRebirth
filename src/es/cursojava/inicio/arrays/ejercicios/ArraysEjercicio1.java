package es.cursojava.inicio.arrays.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEjercicio1 {

    public static void main( String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Número de alumnos"); System.out.print("--");
        int number = scan.nextInt();
        
        int [] grades = new int [number];
        int gradesSum = 0;
        int grade = 0;
        int pass = 0;

        for (int i = 0; i < grades.length; i++) {
            
            System.out.println("Nota del alumno:");
            grade = scan.nextInt();
            grades[i] = grade;
            gradesSum += grade;
        }

        for (int i = 0; i < grades.length; i++) {

            if (grade >= 5) {
                pass++;
            }
        }

        System.out.println(Arrays.toString(grades));
        System.out.println("Nota media: " + gradesSum / number);
        System.out.println("Aprobados: " + pass);
    }
}
