package com.oop.classes.esercizi;

public class MainTipoCapoAbbigliamento {
	
	 public static void main(String[] args) {
	TipoCapoAbbigliamento abbigliamento = new TipoCapoAbbigliamento ("Balmain","Estivo", 50.99);
	System.out.println("Lo sconto e:" +abbigliamento.getApplicaSconto(10));
	
	CapoAbbigliamento capo = new CapoAbbigliamento  ("Balmain","Estivo", 50.99, 28,3,2);
	
	capo.venduto(2);
	capo.getDettagli();
	
	 }
}