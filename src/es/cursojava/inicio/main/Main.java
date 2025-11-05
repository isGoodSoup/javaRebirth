package es.cursojava.inicio.main;
import org.slf4j.Logger;

import es.cursojava.utils.Charlie;

public class Main {
	private static final Logger log = Charlie.toLog(Main.class);
	
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
		String prueba = Charlie.toScan("Test");
		Charlie.toLog(Main.class).info("Prueba con toLog()");
		log.debug("Segunda prueba con toLog()");
	}
}