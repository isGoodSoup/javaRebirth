package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import java.util.Arrays;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArrayEx implements Executable {
	private int pos = 0;	
	
	public static void main(String[] args) {
		ArrayEx main = new ArrayEx();
		main.init();
	}

	@Override
	public void init() {
		ArrayEx main = new ArrayEx();
		int[] array = main.nuevoArray();
		main.popularArray(array);
		main.solicitarPosArray(array);
		main.mostrarArray(array);
		main.mostrarGrafico(array);
		main.mediaArray(array);
	}
	
	private int[] nuevoArray() {
		Dexter.toGetString("NUEVO ARRAY");
		int num = Dexter.toScanInt("Inserta un tamaño para el array");
		int[] array = new int[num];
		return array;
	}
	
	private int[] popularArray(int[] array) {
		Dexter.toGetString("POPULAR ARRAY");
		for (int i = 0; i < array.length; i++) {
			int nuevoNum = Dexter.toScanInt("Inserta un número");
			array[i] = nuevoNum;
		}
		return array;
	}
	
	private int[] solicitarPosArray(int[] array) {
		Dexter.toGetString("SOLICITAR POS");
		do {
			try {
				pos = Dexter.toScanInt("Solicita la posición en el array");
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
