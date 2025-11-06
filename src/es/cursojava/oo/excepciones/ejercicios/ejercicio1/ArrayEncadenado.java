package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.Random;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArrayEncadenado implements Executable {
	private int pos = 0;
	private Random random = new Random();
	
	public static void main(String[] args) {
		ArrayEncadenado main = new ArrayEncadenado();
		main.init();
	}

	@Override
	public void init() {
		boolean toggle = false;
		ArrayEncadenado main = new ArrayEncadenado();
		int[] array = main.nuevoArray();
		main.popularArray(array, toggle);
		main.solicitarPosArray(array, toggle);
		main.mostrarArray(array);
		main.mostrarGrafico(array);
		main.mediaArray(array);
	}
	
	public int[] nuevoArray() {
		Dexter.toGetString("NUEVO ARRAY");
		int num = Dexter.toScanInt("Inserta un tamaño para el array");
		int[] array = new int[num];
		return array;
	}
	
	public int[] popularArray(int[] array, boolean esRandom) {
		int nuevoNum = 0;
		Dexter.toGetString("POPULAR ARRAY");
		for (int i = 0; i < array.length; i++) {
			if(esRandom) {
				System.out.print("Inserta un número: ");
				nuevoNum = random.nextInt(1, 32);
				System.out.println(nuevoNum);
			} else {
				nuevoNum = Dexter.toScanInt("Inserta un número");
			}
			array[i] = nuevoNum;
		}
		return array;
	}
	
	public int[] solicitarPosArray(int[] array, boolean esRandom) {
		Dexter.toGetString("SOLICITAR POS");
		do {
			try {
				if(esRandom) {
					System.out.print("Solicita la posición en el array: ");
					pos = random.nextInt(1, array.length);
					System.out.println(pos);
				} else {
					pos = Dexter.toScanInt("Solicita la posición en el array");
				}
				System.out.println("Valor = " + array[pos]);
			} catch(ArrayIndexOutOfBoundsException e) {
				Dexter.printException(e);
			}
		} while(pos > array.length);
		return array;
	}
	
	public int[] mostrarArray(int[] array) {
		Dexter.toGetString("MOSTRAR ARRAY");
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	public int[] mostrarGrafico(int[] array) {
	    Dexter.toGetString("MOSTRAR ARRAY (GRÁFICO VERTICAL)");
	    int max = Arrays.stream(array).max().getAsInt();
	    for (int nivel = max; nivel > 0; nivel--) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] >= nivel) {
	                System.out.print("# ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	    for (int i = 0; i < array.length; i++) {
	        System.out.print("--");
	    }
	    System.out.println();
	    
	    return array;
	}
	
	public int[] mediaArray(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double media = total/array.length;
		System.out.println("Media = " + media);
		return array;
	}
}
