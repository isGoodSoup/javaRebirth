package es.cursojava.inicio.bucles.ejercicios;

public class BucleParesImparesFor {
    
    public static void main(String[] args) {
        
        for (int i = 2, x = 99; i > 0; i++, x++) {
            if (i%2==0 && x%3==0) {
                i += 2;
                i -= 2;
                
                System.out.println(i + ", " + x);

                if (i == 100 && x == 1) {
                    break;
                }
            }
        }
    }
}
