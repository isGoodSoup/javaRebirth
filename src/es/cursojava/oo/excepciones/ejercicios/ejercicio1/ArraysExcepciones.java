package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArraysExcepciones implements Executable {
	private Dexter dex = new Dexter();
	
	public static void main(String[] args) {
		ArraysExcepciones main = new ArraysExcepciones();
		main.init();
	}

	@Override
	public void init() {
		ArraysExcepciones main = new ArraysExcepciones();
		main.nuevoArray();
	}
	
	public void nuevoArray() {
		int num = Dexter.toScanInt("Inserta un tamaño para el array");
		int[] array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			int nuevoNum = Dexter.toScanInt("Inserta un número");
			array[i] = nuevoNum;
		}
		
		int pos = 0;
		try {
			do {
				pos = Dexter.toScanInt("Solicita la posición en el array");
				System.out.println("Valor: " + array[pos]);
			} while(pos > array.length);
		} catch(ArrayIndexOutOfBoundsException e) {
			dex.printException(e);
		}
	}
}
