package es.cursojava.oo.excepciones;

import es.cursojava.utils.Dexter;

public class Excepciones {
	private Dexter dex = new Dexter();
	
	public static void main(String[] args) {
		Excepciones main = new Excepciones();
		main.init();
	}
	
	public void init() {
		Excepciones main = new Excepciones();
		main.arrayIndexOutOfBounds();
		main.nullPointer();
		main.numberFormat();
		main.illegalArgument();
		main.runtime();
		main.arithmetic();
	}
	
	public void arrayIndexOutOfBounds() {
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			dex.printException(e);
		}
	}
	
	@SuppressWarnings("null")
	public void nullPointer() {
		try {
			String text = null;
			text.substring(1, 2);
		} catch(NullPointerException e) {
			dex.printException(e);
		}
	}
	
	public void numberFormat() {
		try {
			String invalidNumber = "abc";
	        int num = Integer.parseInt(invalidNumber);
	        System.out.println(num);
		} catch(NumberFormatException e) {
			dex.printException(e);
		}
	}
	
	public void illegalArgument() {
		try {
			Thread thread = new Thread();
	        thread.setPriority(-1);
		} catch(IllegalArgumentException e) {
			dex.printException(e);
		}
	}
	
	public void runtime() {
		try {
			throw new RuntimeException();
		} catch(RuntimeException e) {
			dex.printException(e);
		}
	}
	
	public void arithmetic() {
		try {
			int num = 4;
			int result = num/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			dex.printException(e);
		}
	}
}
