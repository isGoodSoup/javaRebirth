package es.cursojava.inicio.bucles;

public class BucleFor {

    public static void main(String[] args) {
//        Bucle infinito
//        for ( ; ; ) {
//            System.out.println("Hello World!");
//        }
//      Se introduce el valor inicial, la condición y el valor. 
        for ( int i=0 ; i < 5 ; i++ ) {
            if (i%2==0) {
                continue;
            }
            System.out.println("Hola, " + i);

            if (i%3==0) {
                break;
            }
        }
    }
}
