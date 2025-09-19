package com.oop.classes.intro;

public class Professionista {

	private int redditoAnnuoLordo;
	private int coefRedd;
	private int tassaInps;
	private int tassaIrpef;
	
	
	
	public Professionista(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coefRedd = coefRedd;
		this.tassaInps = tassaInps;
		this.tassaIrpef = tassaIrpef;
	}

	public int getUtileTasse() {
		return redditoAnnuoLordo * coefRedd /100;
	}
	
	public int getTassaInps() {
		return getUtileTasse() * tassaInps/100;
	}
	
	public int getTassaIrpef() {
		return getUtileTasse() * tassaIrpef/100;
	}
	
	public int getRedditoAnnuoNetto() {
		return redditoAnnuoLordo - (getTassaInps() + getTassaIrpef())/12;
	}
	public static void main(String[] args) {
		Professionista professionista = new Professionista(80000, 78, 26, 15);
		System.out.println(professionista.getUtileTasse());
		System.out.println(professionista.getTassaInps());
		System.out.println(professionista.getTassaIrpef());
		System.out.println(professionista.getRedditoAnnuoNetto());
	}
	

}
