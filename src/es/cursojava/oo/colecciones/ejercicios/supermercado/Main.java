package es.cursojava.oo.colecciones.ejercicios.supermercado;

import es.cursojava.utils.Executable;
import es.cursojava.utils.Gen;

public class Main implements Executable {
	private Supermercado market;
	private Cliente cliente;
	private Cliente[] clientes = new Cliente[4];
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
		main.exit();
	}

	@Override
	public void run() {
		Supermercado mercado = 
				new Supermercado("Aldi", market.getStock(), market.getClientes());
		for (int i = 0; i < clientes.length; i++) {
			Cliente c = new Cliente(Gen.toGetName(), Gen.toGetID(), Gen.toGetInteger(18, 80), cliente.getCarrito());
			clientes[i] = c;
		}
		
	}

	@Override
	public void test() {}

	@Override
	public void exit() {
		System.exit(0);
	}
}
