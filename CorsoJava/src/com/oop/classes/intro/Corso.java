package com.oop.classes.intro;

public class Corso {
	// MODEL	
	
	// ATTRIBUTI DELLA CLASSE
	 private int ore = 0;
	 private String oggettoCorso = "";
	 private String frequenze = "";
	 
	 // COSTRUTTORE DELLA CLASSE DICHIARA IL COSTRUTTORE
	 public Corso(int ore, String oggettoCorso, String frequenze) { // PARAMETRI
			super();
			this.ore = ore;
			this.oggettoCorso = oggettoCorso;
			this.frequenze = frequenze;
	// INIZIALIZZATI
		}
	 
	 // METODI DELLA CLASSE
	 
	 public String getFrequenze() {
		 return frequenze;
	 }

	public static void main(String[] args) {
		 
		Corso corso = new Corso (248, "Back-end", "Settimanale"); 
		// ARGOMENTI E INIZIALLIZZAZIONE DEL COSTRUTTORE
		System.out.println(corso.frequenze); //ATTRIBUTO
		System.out.println(corso.getFrequenze());// METODO
	}

}
