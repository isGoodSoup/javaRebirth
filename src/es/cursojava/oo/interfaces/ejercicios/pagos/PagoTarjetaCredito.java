package es.cursojava.oo.interfaces.ejercicios.pagos;

public class PagoTarjetaCredito extends Pagos {
	private String nombre;
	private int numeroTarjeta;
	
	public PagoTarjetaCredito(int id, String nombre, int numeroTarjeta) {
		super(id);
		this.nombre = nombre;
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Override
	public void procesarPago(double monto) {
		
	}
}
