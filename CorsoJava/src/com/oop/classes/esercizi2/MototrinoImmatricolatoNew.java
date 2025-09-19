package com.oop.classes.esercizi2;

public class MototrinoImmatricolatoNew extends MotorinoNew{
	
	private float maxVelocita;
	private String targa;
	
	
	public MototrinoImmatricolatoNew(String colore, float velocita, String tipo, float maxVelocita, String targa) {
		super(colore, velocita, tipo);
		this.maxVelocita = maxVelocita;
		this.targa = targa;
		
	}
	
	
	public float getMax() {
		return maxVelocita;
	}
	
	public void accelera(float accelera) {
		float s = accelera + velocita;
		if (antifurto == false) {
			if (s < maxVelocita) {
				velocita = s;
			} else {
				velocita = maxVelocita;
			}
		}
	}	
}
