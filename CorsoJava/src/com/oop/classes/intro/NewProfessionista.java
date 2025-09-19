package com.oop.classes.intro;

public class NewProfessionista {
	
	private static int redditoAnnuoLordo;
	private static int coefRedd;
	private static int tassaInps;
	private static int tassaIrpef;


	public static int getRedditoAnnuoLordo() {
		return redditoAnnuoLordo;
	}

	public static void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		NewProfessionista.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public static int getUtile() {
		return getRedditoAnnuoLordo() *coefRedd/100;
	}


	public static void setCoefRedd(int coefRedd) {
		NewProfessionista.coefRedd = coefRedd;
	}


	public static int getTassaInps() {
		return getUtile() *tassaInps/100;
	}


	public static void setTassaInps(int tassaInps) {
		NewProfessionista.tassaInps = tassaInps;
	}


	public static int getTassaIrpef() {
		return getUtile() *tassaIrpef/100;
	}


	public static void setTassaIrpef(int tassaIrpef) {
		NewProfessionista.tassaIrpef = tassaIrpef;
	}
	
	public static int getRedditoNetto() {
		return getRedditoAnnuoLordo() - (getTassaIrpef() + getTassaInps() );
	}


	public static void main(String[] args) {
		
		NewProfessionista.setRedditoAnnuoLordo(80000);
		NewProfessionista.setTassaInps(26);
		NewProfessionista.setTassaIrpef(15);
		NewProfessionista.setCoefRedd(78);
		System.out.println(NewProfessionista.getRedditoNetto());

	}

}
