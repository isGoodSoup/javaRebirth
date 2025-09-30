package es.cursojava.oo.interfaces.ejercicios.pagos;

public class ProcesadorPagos {
	
	public void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}
}
