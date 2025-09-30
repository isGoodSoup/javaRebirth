package es.cursojava.oo.interfaces.ejercicios.productos;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		Alimentos manzana = new Manzana();
		Alimentos baguette = new Baguette();
		Alimentos banana = new Banana();
		Alimentos zanahoria = new Zanahoria();
		
		Alimentos[] comida = {manzana, baguette, banana, zanahoria};
		
		Encendible tablet = new Tablet();
		Encendible movil = new Movil();
		Encendible coche = new Coche();
		Encendible moto = new Moto();
		
		Encendible[] electronica = {tablet, movil, coche, moto};
		for (int i = 0; i < electronica.length; i++) {
			electronica[i].encender();
			electronica[i].apagar();
		}
		
		
	}
}
