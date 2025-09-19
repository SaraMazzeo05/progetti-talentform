package com.oop.classes.intro;

public class Studente {
	// SVILUPPO UTILIZZANDO SOLO IL COSTRUTTORE
	
	
	// MODEL
	
	
	// ATTRIBUTI CLASSE
	private String nome = "";
	private int age = 0;
	private String nation = "";
	private String city = "";
	
	// COSTRUTTORE CLASSE    // DICHIARAZIONE CLASSE
	public Studente(String nome, int age, String nation, String city) {
		this.nome = nome;
		this.age = age;
		this.nation = nation;
		this.city = city;
	}


	public static void main(String[] args) {
		Studente studente = new Studente ("Lucia", 21,"Italy","Roma");
		System.out.println(studente.nome);
		System.out.println(studente.age);
	}

}
