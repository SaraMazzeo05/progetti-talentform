package com.oop.classes.esercizi;

public class MainharrysChecking {

	public static void main(String[] args) {
	 
//		harrysChecking c = new harrysChecking(0, 1000, 500, 400);
//		System.out.println(c.getSecondDraw());
//		harrysChecking momsSaving = new harrysChecking(0, 1000, 500, 400);
//		System.out.println(momsSaving.getTotalAccount());
		harrysChecking c = new harrysChecking();
		c.setBalance(0);
		c.setFirstDeposit(1000);
		c.setFirstDraw(500);
		c.setSecondDraw(400);
		System.out.println(c.getSecondDraw());
		harrysChecking m = new harrysChecking();
		m.setBalance(0);
		m.setFirstDeposit(1000);
		m.setFirstDraw(500);
		m.setSecondDraw(400);
		System.out.println(m.getTotalAccount());
	}
}
