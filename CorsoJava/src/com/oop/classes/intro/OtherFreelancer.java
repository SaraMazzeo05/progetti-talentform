package com.oop.classes.intro;

import com.oop.classes.esercizi.MyFreelancer;

public class OtherFreelancer extends MyFreelancer{

	
	
	public OtherFreelancer(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef) {
		super(redditoAnnuoLordo, coefRedd, tassaInps, tassaIrpef);
		
	}
	@Override
	public int getUtileTasse() {
		return redditoAnnuoLordo *coefRedd/100;
	}
	@Override
	public int getTassaIrpef() {
		return getUtileTasse() *tassaIrpef/100;
	}
	
	@Override
	public int getTassaInps() {
		return getUtileTasse() *tassaInps/100;
	}
	@Override
	public int getTotaleNetto() {
		return redditoAnnuoLordo -(getTassaIrpef() + getTassaInps());
	}
	
	
	
	
}
