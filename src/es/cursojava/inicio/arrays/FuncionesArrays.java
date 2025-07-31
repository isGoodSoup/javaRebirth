package es.cursojava.inicio.arrays;

import java.util.Arrays;

public class FuncionesArrays {

    public static void main( String[] args ) {

        String [] colores = new String [4];
        colores[0] = "azul"; colores[1] = "rojo"; colores[colores.length - 1] = "naranja";
        System.out.println(colores[colores.length - 1]);

        int [] numeros = {7, 4, 2, 5, 29};
        System.out.println(numeros[4]);
        System.out.println(Arrays.toString(numeros));

//      double [] notas = new double [15];
//      System.out.println(notas[0]);
    }
}
