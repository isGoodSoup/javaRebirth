package es.cursojava.inicio.main;
import org.slf4j.Logger;

import es.cursojava.utils.CAT;

public class Main {
	private static final Logger log = CAT.toLog(Main.class);
	
	public static void main(String[] args) {
//		log.error("error");
//		log.warn("warn");
//		log.info("info");
//		log.debug("debug");
		Main main = new Main();
		main.run();
	}
	
	public void run() {
//		log.info(Gen.toGetID());
		String prueba = CAT.toScan("Test");
		CAT.toLog(Main.class).info("Prueba con toLog()");
		log.debug("Segunda prueba con toLog()");
	}
}