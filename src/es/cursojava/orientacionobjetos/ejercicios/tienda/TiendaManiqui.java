package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class TiendaManiqui {
	
	private String nombre = "Prendas Díaz";
	private boolean tiendaAbierta;
	private String message = "";
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	public TiendaManiqui(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirTienda() {
		tiendaAbierta = true;
		message = "Abiertos!";
		System.out.println(message);
	}
	
	public void mostrarEscaparate() {
		Maniqui maniqui1 = new Maniqui();
		maniqui1.maniquiVestir(camisa, pantalon);
		
		Maniqui maniqui2 = new Maniqui();
		maniqui2.maniquiVestir(vestido);
		
		Maniqui maniqui3 = new Maniqui();
		maniqui3.maniquiDesvestir(camisa, pantalon, vestido);
	}
	
	public void cerrarTienda() {
		tiendaAbierta = false;
		message = "Cerrados!";
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		abrirTienda();
		mostrarEscaparate();
		cerrarTienda();
	}
}
