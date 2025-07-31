package es.cursojava.inicio.bucles.ejercicios;

public class BucleParesImpares {
    
    public static void main(String[] args) {
        
        int numeroCrecendo = 2;
        int numeroDecrecendo = 99;
        
        System.out.println(numeroCrecendo + ", " + numeroDecrecendo);
        while (numeroCrecendo > 0) {
            if (numeroCrecendo%2==0) {
                numeroCrecendo += 2;
                numeroDecrecendo -= 2;
                System.out.println(numeroCrecendo + ", " + numeroDecrecendo);

                if (numeroCrecendo == 100) {
                    break;
                }
            }
        }

        System.out.println("Termina");
    }
}
