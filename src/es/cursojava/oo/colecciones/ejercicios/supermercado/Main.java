package es.cursojava.oo.colecciones.ejercicios.supermercado;

import es.cursojava.utils.Executable;

public class Main implements Executable {
	private Supermercado market;
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
		
	}

	@Override
	public void test() {}

	@Override
	public void exit() {
		System.exit(0);
	}
}
