package com.oop.classes.esercizi;

public class DipendenteNew {
	
	private String nome;
	private double stipendio;
	
	
	
	
	public DipendenteNew() {
	}
	
	public DipendenteNew(String nome, double stipendio) {
		super();
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(double nuovoStipendio) {
		this.stipendio = nuovoStipendio;
	}
	
	public void setNome(String nuovoNome) {
		this.nome = nuovoNome;
	}
	
	public void aumento(double percentuale) {
		this.stipendio = stipendio + (stipendio *percentuale/100);
	}
	
	
	
}
