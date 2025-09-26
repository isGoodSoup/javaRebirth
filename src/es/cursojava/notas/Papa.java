package es.cursojava.notas;

import es.cursojava.oo.interfaces.Alpha;
import es.cursojava.oo.interfaces.Bravo;

public class Papa {
	public static void main(String[] args) {
		Alpha alpha = new Alpha();
		alpha.metodo3();
		
		Bravo b = new Alpha();
		Bravo[] objetos = {alpha};
		
		metodo5(b);
	}
	
	public static void metodo5(Bravo bravo) {
		bravo.metodo3();
	}
}
