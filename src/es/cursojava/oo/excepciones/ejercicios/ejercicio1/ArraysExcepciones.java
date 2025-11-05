package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import java.util.Arrays;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArraysExcepciones implements Executable {
	private int pos = 0;	
	
	public static void main(String[] args) {
		ArraysExcepciones main = new ArraysExcepciones();
		main.init();
	}

	@Override
	public void init() {
		ArraysExcepciones main = new ArraysExcepciones();
		int[] array = main.nuevoArray();
		main.popularArray(array);
		main.solicitarPosArray(array);
		main.mostrarArray(array);
	}
	
	public int[] nuevoArray() {
		Dexter.toGetString("NUEVO ARRAY");
		int num = Dexter.toScanInt("Inserta un tamaño para el array");
		int[] array = new int[num];
		return array;
	}
	
	public int[] popularArray(int[] array) {
		Dexter.toGetString("POPULAR ARRAY");
		for (int i = 0; i < array.length; i++) {
			int nuevoNum = Dexter.toScanInt("Inserta un número");
			array[i] = nuevoNum;
		}
		return array;
	}
	
	public int[] solicitarPosArray(int[] array) {
		Dexter.toGetString("SOLICITAR POS");
		do {
			try {
				pos = Dexter.toScanInt("Solicita la posición en el array");
				System.out.println("Valor: " + array[pos]);
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
}
