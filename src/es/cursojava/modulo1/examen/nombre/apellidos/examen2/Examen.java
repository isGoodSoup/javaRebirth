package es.cursojava.modulo1.examen.nombre.apellidos.examen2;

import java.util.Arrays;
import java.util.Scanner;

public class Examen {
	
	// Inicialización de variables
	static Scanner scan = new Scanner(System.in);
	static String msg = "";
	static int opcion = 0;
	static int op1 = 0;
	static int op2 = 0;
	static int op3 = 0;
	static int op4 = 0;
	static int op5 = 0;
	
	public static void main(String[] args) {
		
		String[] menu = {"Multiplo de 3 / Negativo (Parte 1)", 
				"Estadísticas (Parte 2)", 
				"Análisis de texto (Parte 3)",
				"Operaciones con Array (Parte 4)",
				"Cálculo de área y utilidades (Parte 5)",
				"Salir"};
		do {
			Utilidades.printMenu(menu);
			opcion = scan.nextInt();
			switch(opcion) {
				case 1: multiploTres();
						op1++;
						break;
				case 2: numerosEnteros();
						op2++;
						break;
				case 3: analizarPalabras();
						op3++;
						break;
				case 4: arrayNumerico();
						op4++;
						break;
				case 5: utilidadesCalculo();
						op5++;
						break;
				case 6: System.out.println("Adios!");
						break;
				default: System.err.println("Opción inválida");
			}
		} while(opcion != 6);
		
		System.out.println("Opciones = " + op1 + ", " + op2 + ", " + op3 + ", "
				+ op4 + ", " + op5);
	}
	
	public static void multiploTres() {
		// Scan
		System.out.println("Introduce un número");
		int num = scan.nextInt();
		scan.nextLine();
		
		// Condicionales
		if(num %3==0) {
			msg += "MULTIPLO3";
		} else if(num %3!=0) {
			msg += "NO_MULTIPLO3";
		}
		
		if(num < 0) {
			msg += " NEGATIVO";
		}
		System.out.println(msg);
		System.out.println();
	}
	
	public static void numerosEnteros() {
		// Variables
		int num = 0, sum = 0, neg = 0, pos = 0;
		
		System.out.println("Inserta la cantidad de números enteros");
		int n = scan.nextInt();
		
		// Bucle for para sumar todo.
		System.out.println("Introduce " + n + " números");
		for (int i = 0; i < n; i++) {
			num = scan.nextInt();
			if(num < 0) {
				neg++;
			}
			if(num > 0) {
				pos++;
			}
			sum += num;
		}
		double media = sum/n;
		System.out.println("Media=" + media + " Pos=" + pos + " Neg=" + neg);
		System.out.println();
	}
	
	public static void analizarPalabras() {
		// Variables.
		System.out.println("Entra una oración: ");
		Scanner scan2 = new Scanner(System.in);
		String cadena = scan2.nextLine();
		cadena = Utilidades.soloLetras(cadena);
        int cons = 0;
        
        // Bucle for para contar las consonantes.
        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
                cons++;
            }
        }
        
        System.out.println("Consonantes=" + cons);
        System.out.println("Palabras largas(>=4)=");
        System.out.println("Mayus=" + cadena.toUpperCase());
        System.out.println();
	}
	
	public static void arrayNumerico() {
		// Tamaño del array.
		System.out.println("Tamaño del array");
		int num = scan.nextInt();
		scan.nextLine();
		// Variables.
		int numArray = 0;
		int uniq = 0;
		int knum = 0;
		// Array.
		int[] m = new int[num];
		int[] u = {};
		System.out.println("Valor k:");
		int k = scan.nextInt();
		System.out.println("Inserta " + num + " números");
		for (int i = 0; i < m.length; i++) {
			numArray = scan.nextInt();
			m[i] = numArray;
			
			if(m[i] == k) {
				knum++;
			}
		}
		
		System.out.println(Arrays.toString(m));
		System.out.println("Conteo(k=" + k + ")=" + knum);
		System.out.println("Indices(k=" + k + ")=" + knum + " " + Arrays.toString(u));
		
	}
	
	public static void utilidadesCalculo() {
		System.out.println("Inserta un radio");
		int radio = scan.nextInt();
		scan.nextLine();
		System.out.println(Utilidades.areaCirculo(radio));;	
	}
}
