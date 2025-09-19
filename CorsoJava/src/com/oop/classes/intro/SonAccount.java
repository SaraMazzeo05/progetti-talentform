package com.oop.classes.intro;

public class SonAccount extends MotherAccount{
	
	private int canoneAnnuo;

	// ATTRIBUTO CLASSE
	public SonAccount(int balance, int firstDeposit, int secondDeposit, int firstDraw, int secondDraw, int canoneAnnuo) {
		super(balance, firstDeposit, secondDeposit, firstDraw, secondDraw);
		
	}
	@Override
	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	@Override
	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	
	@Override
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	
	
	public int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}
	
	public int getCanoneAnnuo() {
		return getSecondDraw() * canoneAnnuo /100;
	}
	@Override
	public int getTotalAccount() {
		return getSecondDraw() - getCanoneAnnuo();
	}
	public static void main(String[] args) {
		
		//MOTHER ACCOUNT CON OGGETTI
//		MotherAccount mother = new MotherAccount(0, 400, 100, 50, 10);
//		 System.out.println("Saldo di Mother: "+mother.getTotalAccount());
//		
//		 
//		// SON ACCOUNT CON OGGETTI
//		SonAccount son = new SonAccount(0, 300, 10, 50, 20, 10);
//		System.out.println("Saldo di Son: " + son.getTotalAccount());
	}

}
