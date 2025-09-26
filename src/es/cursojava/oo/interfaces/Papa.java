package es.cursojava.oo.interfaces;

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
