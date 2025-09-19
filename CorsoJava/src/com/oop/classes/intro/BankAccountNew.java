package com.oop.classes.intro;

public class BankAccountNew {

	private int Balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	private int thirdDeposit;
	private int thirdDraw;
	private int canoneAnnuo;
	
	
	public BankAccountNew(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
			int thirdDeposit, int thirdDraw, int canoneAnnuo) {
		this.Balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.thirdDeposit = thirdDeposit;
		this.thirdDraw = thirdDraw;
		this.canoneAnnuo = canoneAnnuo;
	}


	public int getFirstDeposit() {
		return Balance + firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	
	public int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}
	public int getThirdDeposit() {
		return getSecondDraw() + thirdDeposit;
	}
	public int getThirdDraw() {
		return getThirdDeposit() - thirdDraw;
	}

	public int getCanoneAnnuo() {
		return  getThirdDraw() * canoneAnnuo/100;
	}
	
	public int getTotalAccount() {
		return getThirdDraw() - getCanoneAnnuo();
	}

	public static void main(String[] args) {
		BankAccountNew bank = new BankAccountNew(0, 500, 100, 200, 50, 30, 10, 5);
		System.out.println("Totale conto:" + bank.getCanoneAnnuo());
	}

}
