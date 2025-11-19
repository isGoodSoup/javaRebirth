package es.cursojava.modulo2.examen2.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cursojava.utils.Dexter;
import es.cursojava.utils.Loggable;
import es.cursojava.utils.interfaces.Iniciable;

public class Main extends Loggable implements Iniciable {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}

	@Override
	public void init() {
		Master master1 = crearMaster(true, "Programación Orientada a Objetos (POO)", 2124, 30);
		Master master2 = crearMaster(true, "Álgebra Avanzada con Implementación a SQL (AAISQL)", 7675, 25);
		Master master3 = crearMaster(false, "Python y Gestión de Datos Relaciones (PGDR)", 3421, 15);
		
		List<Master> masters = new ArrayList<>();
		masters.add(master1);
		masters.add(master2);
		masters.add(master3);
		
		for (Master master : masters) {
			System.out.println(master);
		}

		int codigo = Dexter.toScanInt("Inserta el código del curso");
//		for (Master master : masters) {
//			if(codigo == master.getCodigo()) {
//				masters.remove(master);
//			}
//		}

//		for(Iterator<Master> iterator = masters.iterator(); iterator.hasNext();) {
//			Master master = (Master) iterator.next();
//			if(codigo == master.getCodigo()) {
//				iterator.remove();
//			}
//		}
		
		Iterator<Master> ite = masters.iterator();
		while(ite.hasNext()) {
			Master master = (Master) ite.next();
			if(codigo == master.getCodigo()) {
				try {
					ite.remove();
				} catch(UnsupportedOperationException e) {
					new Dexter().printException(e);
				}
			}
		}
		
		for (Master master : masters) {
			System.out.println(master);
		}
	}
	
	private Master crearMaster(boolean isOficial, String curso, int codigo, int cupo) {
		return new Master(isOficial, "Master de " + curso, codigo, cupo);
	}
}
