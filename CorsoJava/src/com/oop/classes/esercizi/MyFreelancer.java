package com.oop.classes.esercizi;

public class MyFreelancer {

	protected  int redditoAnnuoLordo;
	protected  int coefRedd;
	protected  int tassaInps;
	protected  int tassaIrpef;
	
	
	
	
	
	public MyFreelancer(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef) {
		
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coefRedd = coefRedd;
		this.tassaInps = tassaInps;
		this.tassaIrpef = tassaIrpef;
	}

	
	
	public int getUtileTasse() {
		return redditoAnnuoLordo *coefRedd/100;
	}
	
	public int getTassaIrpef() {
		return getUtileTasse() *tassaIrpef/100;
	}
	
	
	public int getTassaInps() {
		return getUtileTasse() *tassaInps/100;
	}
	
	public int getTotaleNetto() {
		return redditoAnnuoLordo -(getTassaIrpef() + getTassaInps());
	}
	
	
	
}
