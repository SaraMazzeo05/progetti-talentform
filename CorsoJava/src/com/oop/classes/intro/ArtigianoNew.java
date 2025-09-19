package com.oop.classes.intro;

public class ArtigianoNew {
	
	private int redditoAnnuoLordo;
	private int coefficenteRedditivita;
	private int tassaIrpef;
	private int tassaInps;
	private int aliquotaInpsEccedenteIlMinimale;
	private int importoEccedente;

	
	
	public ArtigianoNew(int redditoAnnuoLordo, int coefficenteRedditivita, int tassaIrpef, int tassaInps,
			int aliquotaInpsEccedenteIlMinimale, int importoEccedente) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coefficenteRedditivita = coefficenteRedditivita;
		this.tassaIrpef = tassaIrpef;
		this.tassaInps = tassaInps;
		this.aliquotaInpsEccedenteIlMinimale = aliquotaInpsEccedenteIlMinimale;
		this.importoEccedente = importoEccedente;
	}

	
	public int getRal() {
		return redditoAnnuoLordo;
	}
	//Iperf solo su redditoannuoLordo
	//fino a 15000 solo il 24%
	//aliquota irpef solo > 15000
	
	public int getUtile() {
		return redditoAnnuoLordo * coefficenteRedditivita/100;
	}
	
	public int getCifraIrpef() {
		return getUtile() * tassaIrpef/100;
	}

	public int getUtileEccedente() {
		return (redditoAnnuoLordo - importoEccedente) * coefficenteRedditivita/100;
	}
	public int getCifraInps() {
		return getUtileEccedente() * aliquotaInpsEccedenteIlMinimale/100;
	}
	
	public int getRedditoNetto() {
		return getRal() - (getCifraIrpef() + getCifraInps() + tassaInps);
	}
	
	public static void main(String[] args) {
		ArtigianoNew artigiano = new ArtigianoNew(90000,67, 15, 3500, 24, 15000);
		System.out.println(artigiano.getUtile());
		System.out.println(artigiano.getCifraInps());
		System.out.println(artigiano.getCifraIrpef());
		System.out.println(artigiano.getUtileEccedente());
		System.out.println(artigiano.getRedditoNetto());
	}

}
