package com.oop.classes.intro;

public class NewAccount {

	private static int balance;
	private static int firstDeposit;
	private static int firstDraw;
	private static int secondDeposit;
	private static int secondDraw;
	private static int canoneAnnuo;
	

	public static void setBalance(int balance) {
		NewAccount.balance = balance;
	}


	public static int getFirstDeposit() {
		return NewAccount.balance + NewAccount.firstDeposit;
	}


	public static void setFirstDeposit(int firstDeposit) {
		NewAccount.firstDeposit = NewAccount.firstDeposit;
	}

	public static int getFirstDraw() {
		return NewAccount.getFirstDeposit() - NewAccount.firstDraw;
	}

	public static void setFirstDraw(int firstDraw) {
		NewAccount.firstDraw = NewAccount.firstDraw;
	}

	public static int getSecondDeposit() {
		return NewAccount.getFirstDraw() + NewAccount.secondDeposit;
	}

	public static void setSecondDeposit(int secondDeposit) {
		NewAccount.secondDeposit = NewAccount.secondDeposit;
	}

	public static int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}

	public static void setSecondDraw(int secondDraw) {
		NewAccount.secondDraw = NewAccount.secondDraw;
	}

	public static int getCanoneAnnuo() {
		return getSecondDraw() * NewAccount.canoneAnnuo/100;
	}

	
	public static void setCanoneAnnuo(int canoneAnnuo) {
		NewAccount.canoneAnnuo = canoneAnnuo;
	}

	public static int getTotalAccount() {
		return getSecondDraw() - getCanoneAnnuo();
	}



	public static void main(String[] args) {
		
		NewAccount.setBalance(0);
		NewAccount.setFirstDeposit(500);
		NewAccount.setFirstDraw(100);
		NewAccount.setSecondDeposit(200);
		NewAccount.setSecondDraw(50);
		NewAccount.setCanoneAnnuo(10);
		System.out.println(NewAccount.getTotalAccount());
	}

}
