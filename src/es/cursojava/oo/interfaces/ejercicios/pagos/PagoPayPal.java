package es.cursojava.oo.interfaces.ejercicios.pagos;

public class PagoPayPal extends Pagos {
	private String usuario;
	private String contrasehna;

	public PagoPayPal(int id, String usuario, String contrasehna) {
		super(id);
		this.usuario = usuario;
		this.contrasehna = contrasehna;
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

	@Override
	public void procesarPago(double monto) {
		
		
	}

}
