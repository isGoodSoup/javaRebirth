package es.cursojava.oo.hibernate.ejercicios.ejercicio3.excepciones;

@SuppressWarnings("serial")
public class BusinessException extends Exception {
	
	public BusinessException(String message) {
		super(message);
	}
}
