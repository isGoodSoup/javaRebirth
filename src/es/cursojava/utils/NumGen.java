package es.cursojava.utils;

import java.util.Random;

public class NumGen {
	private static Random r = new Random();
	
	public static double getDouble() {
		int n = r.nextInt(1, 1000);
		double d = n/100.0;
		return d;
	}
}
