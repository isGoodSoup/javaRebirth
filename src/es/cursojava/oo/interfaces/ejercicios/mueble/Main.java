package es.cursojava.oo.interfaces.ejercicios.mueble;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private final static Logger log = LoggerFactory.getLogger(new Object() {}.getClass().getEnclosingClass());
	
	public static void main(String[] args) {
		Main m = new Main();
		m.desinfectarObjetos();
	}
	
	public void desinfectarObjetos() {
		Mueble mesa = new Mesa("");
		Mueble silla = new Silla("");
		Verdura lechuga = new Lechuga("");
		Verdura judias = new JudiasVerdes("", true);
	}
}
