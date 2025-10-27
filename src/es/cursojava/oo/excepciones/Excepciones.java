package es.cursojava.oo.excepciones;

public class Excepciones {
	
	public static void main(String[] args) {
		Excepciones main = new Excepciones();
		try {
			main.recursive();
		} catch (NullPointerException | StackOverflowError e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
//		Exception e = new Exception();
	}
	
	public void recursive() {
		recursive();
	}
}
