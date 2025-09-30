package es.cursojava.oo.interfaces.ejercicios.pagos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagoPayPal extends Pagos {
	private String usuario;
	private String contrasehna;
	private double saldo = 159.99;
	private static final Logger log = LoggerFactory.getLogger(PagoPayPal.class);

	public PagoPayPal() {}
	
	public PagoPayPal(int id, String usuario, String contrasehna, double saldo) {
		super(id);
		this.usuario = usuario;
		this.contrasehna = contrasehna;
		this.saldo = saldo;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasehna() {
		return contrasehna;
	}

	public void setContrasehna(String contrasehna) {
		this.contrasehna = contrasehna;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void procesarPago(double monto) {
		setUsuario("barc4best");
		getContrasehna();
		log.info("Bienvenido, {}!", this.usuario);
		log.debug("Contraseña: ***********");
		log.info("Saldo actual: " + this.saldo);
		log.info("Compra: " + monto);
		log.info("Saldo contable: " + (this.saldo - monto));
	}

}
