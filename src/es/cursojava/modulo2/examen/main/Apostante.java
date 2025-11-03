package es.cursojava.modulo2.examen.main;

import es.cursojava.modulo2.examen.interfaces.Imprimible;
import es.cursojava.modulo2.examen.interfaces.Participable;

public class Apostante extends Persona implements Participable, Imprimible {
	private double saldo;

	public Apostante(String nombre, int edad, double saldo) {
		super(nombre, edad);
		this.saldo = saldo;
	}
	
	@Override
	public String getIdentificador() {
		return Participable.super.getIdentificador();
	}

	@Override
	public String imprimeDatos() {

		return null;
	}
	
	public void substractSaldo(double saldo) {
		this.saldo -= saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
