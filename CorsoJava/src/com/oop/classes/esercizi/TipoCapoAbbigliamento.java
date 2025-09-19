package com.oop.classes.esercizi;

public class TipoCapoAbbigliamento {

	protected String marca;
	protected String modello;
	protected double costo;
	
	
	
	
	public TipoCapoAbbigliamento(String marca, String modello, double costo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public double getApplicaSconto(double sconto) {
		return costo - (costo * sconto/100);
	}
	
	public void getModificaCosto (double c) {
		this.costo = c;
	}
	
}
