package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class TiendaManiqui {
	
	private String nombre = "Prendas Díaz";
	boolean tiendaAbierta;
	private String message = "";
	
	public String getTienda() {
		return nombre;
	}
	
	public void setTienda(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirTienda() {
		tiendaAbierta = true;
		message = "Abiertos!";
		System.out.println(message);
		
	}
	
	public void mostrarEscaparate() {
		
	}
	
	public void cerrarTienda() {
		tiendaAbierta = false;
		message = "Cerrados!";
		System.out.println(message);
	}
	
	public void main(String[] args) {
		abrirTienda();
		mostrarEscaparate();
		cerrarTienda();
	}
}
