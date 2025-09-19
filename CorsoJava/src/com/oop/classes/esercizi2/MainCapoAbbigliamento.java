package com.oop.classes.esercizi2;


public class MainCapoAbbigliamento {

	public static void main(String[] args) {
	  
		Magazzino abbigliamento = new Magazzino("Balmain","Estivo", 50.99f, 28,3,2);
		
		abbigliamento.applicaSconto(10);
		
		
		abbigliamento.venduto(2);
		abbigliamento.dettagli();
		
	}

}
