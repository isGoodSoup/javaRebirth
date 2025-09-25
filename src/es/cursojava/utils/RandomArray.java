package es.cursojava.utils;

import java.util.Random;

public class RandomArray {
	private final static Random random = new Random();
	
	public static String toGetString(String[] s) {
		String item = s[random.nextInt(s.length)];
		return item;
	}
	
	public static int toGetInteger(int[] i) {
		int item = i[random.nextInt(i.length)];
		return item;
	}
}
