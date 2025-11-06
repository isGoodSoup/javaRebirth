package es.cursojava.oo.excepciones.ejercicios.ejercicio2;

public class NotaInvalidaException extends Exception {
	private static final long serialVersionUID = 2445141762516076056L;

	public NotaInvalidaException(String mensaje) {
		super(mensaje);
	}
}
