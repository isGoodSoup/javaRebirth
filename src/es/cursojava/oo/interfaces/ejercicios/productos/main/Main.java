package es.cursojava.oo.interfaces.ejercicios.productos.main;

import es.cursojava.oo.interfaces.ejercicios.productos.alimentos.Baguette;
import es.cursojava.oo.interfaces.ejercicios.productos.alimentos.Banana;
import es.cursojava.oo.interfaces.ejercicios.productos.alimentos.Manzana;
import es.cursojava.oo.interfaces.ejercicios.productos.alimentos.Zanahoria;
import es.cursojava.oo.interfaces.ejercicios.productos.electronica.Movil;
import es.cursojava.oo.interfaces.ejercicios.productos.electronica.Tablet;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Capitalismo;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Consultable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Deletable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Insertable;
import es.cursojava.oo.interfaces.ejercicios.productos.interfaces.Updatable;
import es.cursojava.oo.interfaces.ejercicios.productos.vehiculos.Coche;
import es.cursojava.oo.interfaces.ejercicios.productos.vehiculos.Moto;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		Capitalismo manzana = new Manzana();
		Capitalismo baguette = new Baguette();
		Capitalismo banana = new Banana();
		Capitalismo zanahoria = new Zanahoria();
		
		Capitalismo tablet = new Tablet();
		Capitalismo movil = new Movil();
		Capitalismo coche = new Coche();
		Capitalismo moto = new Moto();
		
		Capitalismo[] electronica = {manzana, baguette, banana, zanahoria, 
				tablet, movil, coche, moto};
		for (int i = 0; i < electronica.length; i++) {
			electronica[i].encender();
			electronica[i].apagar();
			electronica[i].createId();
		}
		
		selectObject((Consultable) manzana);
		insertObjects((Insertable) coche);
		updateObjects((Updatable) coche);
		deleteObjects((Deletable) moto);
		
	}
	
	public static void selectObject(Consultable consultar) {
		consultar.select();
	}
	
	public static void insertObjects(Insertable insertar) {
		insertar.insert();
	}
	
	public static void updateObjects(Updatable update) {
		update.update();
	}
	
	public static void deleteObjects(Deletable eliminar) {
		eliminar.delete();
	}
}
