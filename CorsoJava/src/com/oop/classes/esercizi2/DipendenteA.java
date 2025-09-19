package com.oop.classes.esercizi2;

public class DipendenteA extends Dipendente{
	
	private int malattia;

	public DipendenteA(String matricola, float stipendio, float straordinario, int malattia) {
		super(matricola, stipendio, straordinario);
		this.malattia = malattia;
	}

	public void prendiMalattia(int giorniMalattia) {
		malattia = malattia + giorniMalattia;
	}
	@Override
	public float paga(int ore) {
		float p = super.paga(ore);
		if (malattia == 0) {
			return p;
		}else {
			p = p -(malattia *15f);
		}
		return this.stipendio;
	}
	public void Stampa() {
		System.out.println(malattia);
	}
}
