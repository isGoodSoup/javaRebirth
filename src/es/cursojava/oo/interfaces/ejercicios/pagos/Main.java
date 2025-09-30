package es.cursojava.oo.interfaces.ejercicios.pagos;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		ProcesadorPagos procesador = new ProcesadorPagos();
		
		Pago tarjeta = new PagoTarjetaCredito();
		procesador.realizarPago(tarjeta, 9.99);
		
		Pago paypal = new PagoPayPal();
		procesador.realizarPago(paypal, 10.99);
		
		Pago cripto = new PagoCriptomoneda();
		procesador.realizarPago(cripto, 21.75);
	}
}
