package es.cursojava.oo.interfaces.ejercicios.pagos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagoTarjetaCredito extends Pagos {
	private String nombre;
	private int numeroTarjeta;
	private static final Logger log = LoggerFactory.getLogger(PagoTarjetaCredito.class);
	
	public PagoTarjetaCredito() {}
	
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
		setNombre("Jose Luis");
		log.info("La compra a nombre de {}", this.nombre);
		setNumeroTarjeta(9056);
		log.info("Con número **** **** **** {}", this.numeroTarjeta);
		log.info("Ha sido realizada con éxito");
		log.info("Compra: " + monto);
	}
}
