package com.oop.classes.intro;

public class Commerciante {

	private int redditoAnnuoLordo;
	private int coefficenteRedd;
	private int tassaIrpef;
	private int tassaInps;
	private int aliquotaInps;
	private int importoEccedente;
	
	
	
	public Commerciante(int redditoAnnuoLordo, int coefficenteRedd, int tassaIrpef, int tassaInps,
			int aliquotaEccedente, int importoEccedente) {
	
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coefficenteRedd = coefficenteRedd;
		this.tassaIrpef = tassaIrpef;
		this.tassaInps = tassaInps;
		this.aliquotaInps = aliquotaInps;
		this.importoEccedente = importoEccedente;
	}

	public int getRal() {
		return redditoAnnuoLordo;
	}
	
	public int getUtile() {
		return redditoAnnuoLordo * coefficenteRedd/100;
	}
	
	public int getCifraIrpef() {
		return getUtile() * tassaIrpef/100;
	}

	public int getUtileEccedente() {
		return (redditoAnnuoLordo - importoEccedente) * coefficenteRedd/100;
	}
	public int getCifraInps() {
		return getUtileEccedente() * aliquotaInps/100;
	}
	
	public int getRedditoNetto() {
		return getRal() - (getCifraIrpef() + getCifraInps() + tassaInps);
	}

	public static void main(String[] args) {
		Commerciante commerciante = new Commerciante(125000, 40, 15, 3000, 24, 15000);
		System.out.println(commerciante.getUtile());
		System.out.println(commerciante.getCifraIrpef());
		System.out.println(commerciante.getUtileEccedente());
		System.out.println(commerciante.getRedditoNetto());
	}

}
