package es.cursojava.modulo2.examen2.excepciones;

@SuppressWarnings("serial")
public class MissingMasterException extends Exception {

	public MissingMasterException(String message) {
		super(message);
	}
}
