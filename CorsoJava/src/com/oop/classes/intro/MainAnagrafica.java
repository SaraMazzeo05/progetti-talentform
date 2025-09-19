package com.oop.classes.intro;

public class MainAnagrafica {

	public static void main(String[] args) {
		 
		Anagrafica ana = new Anagrafica ();
		ana.setTitolostudio("Laurea");
		ana.setNome("Luca");
		ana.setCognome("Rossi");
		ana.setNazione("Italia");
		
		System.out.println(ana.getTitolostudio());
		System.out.println(ana.getNome());
		System.out.println(ana.getCognome());
		System.out.println(ana.getNazione());
		
		DatiAnagrafica dati = new DatiAnagrafica();
		dati.setTitolostudio("Diploma");
		dati.setNome("Lucia");
		dati.setCognome("Rossi");
		dati.setNazione("Italia");
		
		System.out.println(dati.getTitolostudio());
		System.out.println(dati.getNome());
		System.out.println(dati.getCognome());
		System.out.println(dati.getNazione());
		
	}

}
