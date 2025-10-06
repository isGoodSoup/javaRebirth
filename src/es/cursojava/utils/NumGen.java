package es.cursojava.utils;

import java.util.Random;

public class NumGen {
	private static Random r = new Random();
	
	public static double getDouble(int min, int max) {
		int n = r.nextInt(min, max);
		double d = n/100.0;
		return d;
	}
}
