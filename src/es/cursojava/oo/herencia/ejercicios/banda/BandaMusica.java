package es.cursojava.oo.herencia.ejercicios.banda;

public class BandaMusica {
	
	public void main(String[] args) {
		Instrumento i1 = new Instrumento("guitarra", "cuerda pulsada", true);
		Instrumento i2 = new Instrumento("eléctrica", "cuerda pulsada", true);
		Instrumento i3 = new Instrumento("piano", "cuerda percutida", true);
		Instrumento i4 = new Instrumento("tambor", "percusión", true);
		Instrumento[] banda = {i1, i2, i3, i4};
	}
	
	public void afinarInstrumentos() {
		
	}
	
	public void tocarInstrumentos() {
		
	}
}
