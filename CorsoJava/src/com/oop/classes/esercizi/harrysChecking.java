package com.oop.classes.esercizi;

public class harrysChecking {

	protected int balance;
	protected int firstDeposit;
	protected int firstDraw;
	protected int secondDraw;
	
	
	
//	public harrysChecking(int balance, int firstDeposit, int firstDraw, int secondDraw) {
//		super();
//		this.balance = balance;
//		this.firstDeposit = firstDeposit;
//		this.firstDraw = firstDraw;
//		this.secondDraw = secondDraw;
//	}
	
	
	
	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	
	public int getSecondDraw() {
		return getFirstDraw() - secondDraw;
		
	}
	
	public int getInterest() {
		return getSecondDraw() *10/100;
	}
	public int getTotalAccount() {
		return getSecondDraw() - getInterest();
	}
}
