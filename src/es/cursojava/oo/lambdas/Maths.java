package es.cursojava.oo.lambdas;

public class Maths {

	public static int operar(int a, int b, Operacion op) {
		return op.operar(a, b);
	}
}
