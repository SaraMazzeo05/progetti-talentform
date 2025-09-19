package com.oop.classes.esercizi2;

public class MainDipendente {

	public static void main(String[] args) {
		Dipendente  dip = new Dipendente("a012", 1450.0f, 200.0f);
        
		dip.paga(20);
		System.out.println(dip.getStipendio());
		
		dip.Stampa();
		
		DipendenteA dipendenteA = new DipendenteA("001A",1800f, 30,0);
		        
		dipendenteA.prendiMalattia(7);
		        System.out.println(dipendenteA.paga(5));
		        dipendenteA.Stampa();

	}

}
