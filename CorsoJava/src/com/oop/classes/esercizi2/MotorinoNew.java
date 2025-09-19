package com.oop.classes.esercizi2;

public class MotorinoNew {
	
	protected String colore;
	protected float velocita;
	protected String tipo;
	protected boolean antifurto;
	
	
	
	public MotorinoNew(String colore, float velocita, String tipo) {
	
		this.colore = colore;
		this.velocita = velocita;
		this.tipo = tipo;
	}
	
	public float getVelocita() {
		return velocita;
	}
	
	public void accelera(float accelera) {
		if (antifurto == false) {
			velocita += accelera;
		} else {
			System.out.println("Antifurto inserito, non è possibile accelerare");
		}
		
	}
	
	public void inserisciAntifurto() {
		antifurto = true;
	}
}
