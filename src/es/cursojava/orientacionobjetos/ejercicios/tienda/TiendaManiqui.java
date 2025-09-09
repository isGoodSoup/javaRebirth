package es.cursojava.orientacionobjetos.ejercicios.tienda;

import java.util.Arrays;

public class TiendaManiqui {
	
	private String nombre;
	private Maniqui[] maniquies;

	public TiendaManiqui(String nombre) {
		super();
		this.maniquies = new Maniqui[3];
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void abrirTienda() {
		System.out.println("Abiertos!");
		Boton boton1 = new Boton("Negro", 2, "Redondo");
		Boton boton2 = new Boton("Negro", 2, "Redondo");
		Boton boton3 = new Boton("Negro", 2, "Redondo");
		Boton boton4 = new Boton("Negro", 2, "Redondo");
		Boton[] botones = {boton1, boton2, boton3, boton4};
		
		Camisa camisa = new Camisa("Blanca", 50, 78, botones);
		Pantalon pantalon = new Pantalon("Azul", 44, 89, boton4);
		Vestido vestido = new Vestido("Rojo", 43, 40);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, camisa, pantalon);
		Maniqui maniqui3 = new Maniqui(3, vestido);
		
		maniquies[0] = maniqui1;
		maniquies[1] = maniqui2;
		maniquies[2] = maniqui3;
	}
	
	public void mostrarEscaparate() {
		
//		for (Maniqui maniqui : maniquies) {
//			
//		}
	}
	
	public void cerrarTienda() {
		System.out.println("Adios!");
	}
	
	public static void main(String[] args) {
		TiendaManiqui tienda = new TiendaManiqui("Tienda");
		tienda.abrirTienda();
		tienda.mostrarEscaparate();
		tienda.cerrarTienda();
	}
}
