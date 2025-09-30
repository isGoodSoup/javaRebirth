package es.cursojava.oo.interfaces.ejercicios.pagos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagoCriptomoneda extends Pagos {
	private String usuario;
	private String contrasenha;
	private double saldo = 250.90;
	private static final Logger log = LoggerFactory.getLogger(PagoCriptomoneda.class);
	
	public PagoCriptomoneda() {}
	
	public PagoCriptomoneda(int id, String usuario, String contrasenha, double saldo) {
		super(id);
		this.usuario = usuario;
		this.contrasenha = contrasenha;
		this.saldo = saldo;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void procesarPago(double monto) {
		setUsuario("cryptobros4laif");
		getContrasenha();
		log.info("Bienvenido de vuelta, {}!", this.usuario);
		log.info("Contraseña aceptada");
		log.debug("Saldo actual: {}", this.saldo);
		log.info("Saldo contable: {}", (this.saldo - monto));
		log.info("Compra: {}", monto);
	}
}
