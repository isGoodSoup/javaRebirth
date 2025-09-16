package es.cursojava.oo.herencia.ejercicios.banda;

public class BandaMusica {
	
	public void main(String[] args) {
		Instrumento i1 = new Instrumento("guitarra", "guitarra acústica", true);
		Instrumento i2 = new Instrumento("eléctrica", "guitarra eléctrica", true);
		Instrumento i3 = new Instrumento("piano", "piano de cola", true);
		Instrumento i4 = new Instrumento("tambor", "tambor", true);
		Instrumento[] orquesta = {i1, i2, i3, i4};
	}
	
	public void afinarInstrumentos() {
		
	}
	
	public void tocarInstrumentos() {
		
	}
}
