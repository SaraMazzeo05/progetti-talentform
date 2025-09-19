package com.oop.classes.intro;

public class SecondAccount extends FirstAccount {
	
	private int canoneAnnuo;

//	public int getFirstDeposit() {
//		return getBalance() + firstDeposit;
//	}
	
	public int getCanoneAnnuo() {
		return getSecondDraw() *canoneAnnuo/100;
	}

	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}
	
	public int getTotalAccount() {
		return getSecondDraw() - getCanoneAnnuo();
	}
	
	
	
	
	
	
	

}
