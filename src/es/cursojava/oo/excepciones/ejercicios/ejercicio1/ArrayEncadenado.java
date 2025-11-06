package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArrayEncadenado implements Executable {
	private int pos = 0;
	private int max = 0;
	private int min = 0;
	private Random random = new Random();
	
	public static void main(String[] args) {
		ArrayEncadenado main = new ArrayEncadenado();
		main.init();
	}

	@Override
	public void init() {
		boolean toggle = true;
		ArrayEncadenado main = new ArrayEncadenado();
		int[] array = main.nuevoArray();
		main.popularArray(array, toggle);
		main.solicitarPosArray(array, toggle);
		main.mostrarArray(array);
		main.mediaArray(array);
		main.absolutosArray(array);
		main.primosArray(array);
		main.mostrarGrafico(array);
	}
	
	private int[] nuevoArray() {
		Dexter.toGetString("NUEVO ARRAY");
		int num = Dexter.toScanInt("Inserta un tamaño para el array");
		int[] array = new int[num];
		return array;
	}
	
	private int[] popularArray(int[] array, boolean esRandom) {
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
	
	private int[] solicitarPosArray(int[] array, boolean esRandom) {
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
	
	private int[] mostrarArray(int[] array) {
		Dexter.toGetString("MOSTRAR ARRAY");
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	private int[] mediaArray(int[] array) {
		Dexter.toGetString("TOTAL Y MEDIA");
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double media = total/array.length;
		System.out.println("Total = " + total);
		System.out.println("Media = " + media);
		return array;
	}
	
	private int[] absolutosArray(int[] array) {
		Dexter.toGetString("MÁXIMO Y MÍNIMO");
		max = Arrays.stream(array).max().getAsInt();
		min = Arrays.stream(array).min().getAsInt();
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		return array;
	}
	
	private int[] primosArray(int[] array) {
	    Dexter.toGetString("NÚMEROS PRIMOS");
	    List<Integer> primos = new ArrayList<>();
	    for (int i = 0; i < array.length; i++) {
	        int num = array[i];
	        if (Dexter.isPrime(num) && !primos.contains(num)) {
	            primos.add(num);
	        }
	    }
	    if(!primos.isEmpty()) {
	    	System.out.println(primos);
	    } else {
	    	System.err.println("No hay números primos");
	    }
	    return array;
	}
	
	private int[] mostrarGrafico(int[] array) {
	    Dexter.toGetString("MOSTRAR ARRAY (GRÁFICO)");
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
}
