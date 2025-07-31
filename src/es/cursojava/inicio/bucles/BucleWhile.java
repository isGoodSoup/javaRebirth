package es.cursojava.inicio.bucles;

public class BucleWhile {
    
    public static void main(String[] args) {
        
//      La condición se cumple mientras se cumpla la condición.
//      Esto puede ser indefinidamente.
        int numero = 10;
        while (numero > 0) {
            System.out.println(numero);
            if(numero%3==0) {
                numero -= 2;
                continue;
            }

            numero --;
        }

        System.out.println("Termina");
    }
}
