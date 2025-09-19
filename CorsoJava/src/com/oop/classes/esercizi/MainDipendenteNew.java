package com.oop.classes.esercizi;

public class MainDipendenteNew {

	public static void main(String[] args) {
		
		DipendenteNew dipendente = new DipendenteNew();
		dipendente.setNome("Gianni");
		dipendente.setStipendio(1450);
		dipendente.aumento(10);
		
		System.out.println(dipendente.getNome() +" "+ dipendente.getStipendio());
		DipendenteNew a = new DipendenteNew("Lucia", 1500);
		a.aumento(20);
		System.out.println(a.getNome() +" "+ a.getStipendio());
	}

}
