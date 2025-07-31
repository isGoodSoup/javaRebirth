package es.cursojava.inicio.bucles.ejercicios;

public class BuclePares {

    public static void main(String[] args) {
        
        for (int i = 0, x = 99; i <= 100; i += 2, x -= 2) {
            System.out.println(i + ", " + x);
        }
    }
}
