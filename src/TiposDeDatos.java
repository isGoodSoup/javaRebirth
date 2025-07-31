import java.util.Scanner;

public class TiposDeDatos {
    
    @SuppressWarnings("resource")
    public static void main( String[] args ) {
        // Tipos primitivos 
        // Enteros
        /*
         * byte  8   -128    127
         * short 16  -32.768 32.767
         * int   32  32      2³¹
         * long  64  -2⁶³    2⁶³-1
         */

        /*byte edad = 10;
        short numero2 = 123;
        int numero = 2300;
        long numero3 = 1890;
        System.out.println(edad + numero2 + numero + numero3);
        */
        // Decimales
        /*double decimal1 = 9.7;
        float decimal2 = 100.9f;
        System.out.println(decimal1 + decimal2);
         */
        // Caracteres
        /*char caracter = 'a';
        boolean esMayorEdad = false;
        System.out.println(esMayorEdad);
        System.out.println(caracter);
        */
        // Tipos objeto
        String nombre = "Diego";
        System.out.println(nombre.toUpperCase());
        
        //System.out.println(Math.random());
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tus apellidos");
        String apellidos = scan.nextLine();
        
        System.out.println("Introduce tu altura");
        double altura = scan.nextDouble();
        
        System.out.println(nombre + " " + apellidos + " " + altura);
    }
}
