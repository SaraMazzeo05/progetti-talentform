package com.oop.classes.esercizi2;

public class MainMototrinoNew {

	public static void main(String[] args) {
		
		MotorinoNew motorino = new MotorinoNew ("Verde",50.4f, "Vespa");
		 	motorino.accelera(20.3f);
	        System.out.println("La velocità attuale è di: " + motorino.getVelocita());
	        motorino.inserisciAntifurto();
	        motorino.accelera(20.3f);
	        System.out.println("La velocità attuale è di: " + motorino.getVelocita());
	        
	        
	        MototrinoImmatricolatoNew mo = new MototrinoImmatricolatoNew("Viola", 50.4f, "Vespa", 100.0f, "ABCDEF");
	  
	        mo.accelera(70.7f);
	        mo.getMax();
	        System.out.println("La velocità attuale è: " + mo.getVelocita());
	        
	}

}
