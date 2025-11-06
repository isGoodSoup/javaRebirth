package es.cursojava.oo.excepciones.ejercicios.ejercicio1;

import java.util.Random;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Executable;

public class ArrayExRandom implements Executable {
	private int pos = 0;	
	private Random random = new Random();
	
	public static void main(String[] args) {
		ArrayExRandom main = new ArrayExRandom();
		main.init();
	}

	@Override
	public void init() {
		ArrayExRandom main = new ArrayExRandom();
		ArrayEx mainArray = new ArrayEx();
		int[] array = main.nuevoArray();
		main.popularArray(array);
		main.solicitarPosArray(array);
		mainArray.mostrarArray(array);
		mainArray.mostrarGrafico(array);
		mainArray.mediaArray(array);
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
			System.out.print("Inserta un número: ");
			int nuevoNum = random.nextInt(1, 32);
			System.out.println(nuevoNum);
			array[i] = nuevoNum;
		}
		return array;
	}
	
	private int[] solicitarPosArray(int[] array) {
		Dexter.toGetString("SOLICITAR POS");
		do {
			try {
				System.out.print("Solicita la posición en el array: ");
				pos = random.nextInt(1, array.length);
				System.out.println(pos);
				System.out.println("Valor = " + array[pos]);
			} catch(ArrayIndexOutOfBoundsException e) {
				Dexter.printException(e);
			}
		} while(pos > array.length);
		return array;
	}
}
