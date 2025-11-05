package es.cursojava.oo.colecciones.ejercicios.supermercado;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Dexter;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		Main main = new Main();
		Supermercado supermercado = main.abrirSupermercado();
		main.iniciarCompras(supermercado);
	}
	
	public Supermercado abrirSupermercado() {
		Cliente c1 = new Cliente(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetInteger(18, 80));
		Cliente c2 = new Cliente(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetInteger(18, 80));
		Cliente c3 = new Cliente(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetInteger(18, 80));
		Cliente c4 = new Cliente(Dexter.toGetName(), Dexter.toGetID(), Dexter.toGetInteger(18, 80));
		Supermercado supermercado = new Supermercado("ALDI");
		
		supermercado.addCliente(c1);
		supermercado.addCliente(c2);
		supermercado.addCliente(c3);
		supermercado.addCliente(c4);
		supermercado.toStock();
		
		return supermercado;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void iniciarCompras(Supermercado supermercado) {
		Set<Cliente> clientes = supermercado.getClientes();
		
		for(Cliente cliente : clientes) {
			log.info("Bienvenido al {}! ", supermercado.getNombre() + 
					" Disfruta de tu instancia, " + cliente.getNombre());
			List<List<Alimentos>> alimentos = supermercado.getStock();
			for(List<Alimentos> alimento : alimentos) {
				System.out.println(alimento.getFirst().getClass().getSimpleName() + " -> " + alimento.size());
			}
			String respuesta = "";
			do {
				String producto = Dexter.toScan("Cuál producto deseas?");
				int ctd = Dexter.toScanInt("Cuántos quieres");
				
				for(List<Alimentos> alimento : alimentos) {
					String productoParsado = alimentos.getFirst().getClass().getSimpleName();
					if(producto.equalsIgnoreCase(productoParsado)) {
						for(int i = 0; i < ctd; i++) {
							alimento = alimentos.get(i);
							cliente.addAlimento((Alimentos) alimento);
							alimento.removeLast();
						}
						alimentos.removeAll(cliente.getCarrito());
					}
				}
				respuesta = Dexter.toScan("Deseas algo más?");
			} while(!respuesta.equalsIgnoreCase("si"));
		}
	}
}
