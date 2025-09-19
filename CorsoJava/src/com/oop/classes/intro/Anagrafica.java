package com.oop.classes.intro;

public class Anagrafica {

	private String titolostudio;
	private String nome;
	private String cognome;
	private String nazione;
	
	
	
	
//	public Anagrafica(String titolostudio, String nome, String cognome, String nazione) {
//		super();
//		this.titolostudio = titolostudio;
//		this.nome = nome;
//		this.cognome = cognome;
//		this.nazione = nazione;
//	}
	
	
	public String getTitolostudio() {
		return titolostudio;
	}

	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public String getNazione() {
		return nazione;
	}

	
	public void setTitolostudio(String titolostudio) {
		this.titolostudio = titolostudio;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}


	
	
public static void main (String[] args) {
		
		Anagrafica anagrafica = new Anagrafica();
		System.out.println(anagrafica.titolostudio);
		System.out.println(anagrafica.nome);
		System.out.println(anagrafica.cognome);
		System.out.println(anagrafica.nazione);
		
		
	}
	
	
	
	
}
