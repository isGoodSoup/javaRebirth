package es.cursojava.modulo2.examen2.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cursojava.modulo2.examen2.excepciones.MissingMasterException;
import es.cursojava.utils.Dexter;
import es.cursojava.utils.Loggable;
import es.cursojava.utils.interfaces.Iniciable;

public class Main extends Loggable implements Iniciable {
	private Dexter dex = new Dexter();
	
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
		Iterator<Master> ite = masters.iterator();
		boolean isFound = false;
		while (ite.hasNext()) {
		    Master master = ite.next();
		    if (codigo == master.getCodigo()) {
		        try {
		            ite.remove();
		            isFound = true;
		            break;
		        } catch (UnsupportedOperationException e) {
		            dex.printException(e);
		        }
		    }
		}
		
		if (!isFound) {
		    try {
		        throw new MissingMasterException("El master que se especifica no se encuentra");
		    } catch (MissingMasterException e) {
		        dex.printException(e);
		    }
		}
		
		for (Master master : masters) {
			System.out.println(master);
		}
	}
	
	private Master crearMaster(boolean isOficial, String curso, int codigo, int cupo) {
		Master master = new Master(isOficial, "Master de " + curso, codigo, cupo);
		return master;
	}
}
