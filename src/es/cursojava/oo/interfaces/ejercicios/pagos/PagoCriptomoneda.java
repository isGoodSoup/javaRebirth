package es.cursojava.oo.interfaces.ejercicios.pagos;

public class PagoCriptomoneda extends Pagos {
	private String usuario;
	private String contrasenha;
	
	public PagoCriptomoneda(int id, String usuario, String contrasenha) {
		super(id);
		this.usuario = usuario;
		this.contrasenha = contrasenha;
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

	@Override
	public void procesarPago(double monto) {
		
		
	}
}
