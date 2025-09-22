package es.cursojava.oo.herencia.ejercicios.banda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandaMusica {
	private final static Logger log = LoggerFactory.getLogger(BandaMusica.class);
	
	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		Instrumento[] i = banda.empezarConcierto();
		
		banda.afinarInstrumentos(i);
		banda.tocarInstrumentos(i);
	}
	
	public Instrumento[] empezarConcierto() {
		Instrumento i1 = new Guitarra("guitarra", "cuerda pulsada", true, 4);
		Instrumento i2 = new GuitarraElectrica("guitarra eléctrica", "cuerda pulsada", false, 6, 4);
		Instrumento i3 = new Piano("piano", "cuerda percutida", false, 8, "de cola");
		Instrumento i4 = new Tambor("tambor", "percusión", true, "tela");
		Instrumento[] banda = {i1, i2, i3, i4};
		return banda;
	}
	
	public void afinarInstrumentos(Instrumento[] i) {
		log.info("Afinando instrumentos...");
		for (Instrumento instrumento : i) {
			instrumento.afinar();
		}
	}
	
	public void tocarInstrumentos(Instrumento[] i) {
		log.info("Tocando instrumentos");
		for (Instrumento instrumento : i) {
			if(instrumento.getNombre().equals("tambor")) {
				instrumento.tocar();
			} else {
				instrumento.tocar();
			}
		}
	}
}
