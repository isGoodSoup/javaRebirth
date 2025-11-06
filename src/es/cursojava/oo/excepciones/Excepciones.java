package es.cursojava.oo.excepciones;

import es.cursojava.utils.Dexter;

public class Excepciones {
	
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
		try {
			main.wtf();
		} catch (WhatTheFuckException e) {
			Dexter.printException(e);
		}
	}
	
	public void arrayIndexOutOfBounds() {
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			Dexter.printException(e);
		}
	}
	
	@SuppressWarnings("null")
	public void nullPointer() {
		try {
			String text = null;
			text.substring(1, 2);
		} catch(NullPointerException e) {
			Dexter.printException(e);
		}
	}
	
	public void numberFormat() {
		try {
			String invalidNumber = "abc";
	        int num = Integer.parseInt(invalidNumber);
	        System.out.println(num);
		} catch(NumberFormatException e) {
			Dexter.printException(e);
		}
	}
	
	public void illegalArgument() {
		try {
			Thread thread = new Thread();
	        thread.setPriority(-1);
		} catch(IllegalArgumentException e) {
			Dexter.printException(e);
		}
	}
	
	public void runtime() {
		try {
			throw new RuntimeException();
		} catch(RuntimeException e) {
			Dexter.printException(e);
		}
	}
	
	public void arithmetic() {
		try {
			int num = 4;
			int result = num/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			Dexter.printException(e);
		}
	}
	
	public void wtf() throws WhatTheFuckException {
		WhatTheFuckException e = new WhatTheFuckException("Wtf did you do?");
		throw e;
	}
}
