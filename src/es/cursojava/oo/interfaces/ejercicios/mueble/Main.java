package es.cursojava.oo.interfaces.ejercicios.mueble;

public class Main {
	
	public static void main(String[] args) {
		Main m = new Main();
		m.desinfectarObjetos();
	}
	
	public void desinfectarObjetos() {
		Limpiable mesa = new Mesa("verde", "redonda");
		Limpiable silla = new Silla("verde", "madera");
		Desinfectable lechuga = new Lechuga("Valencia");
		Desinfectable judias = new JudiasVerdes("Madrid", true);
		
		mesa.limpiar();
		silla.limpiar();
		
		lechuga.desinfectar();
		judias.desinfectar();
	}
}
