package com.oop.classes.intro;

public class NewBank {

	private int saldo;
	private int primoDeposito;
	private int primoPrelievo;
	private int secondoDeposito;
	private int secondoPrelievo;
	private int canonAnnuo;



	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	public int getPrimoDeposito() {
		return saldo + primoDeposito;
	}



	public void setPrimoDeposito(int primoDeposito) {
		this.primoDeposito = primoDeposito;
	}



	public int getPrimoPrelievo() {
		return getPrimoDeposito() - primoPrelievo;
	}



	public void setPrimoPrelievo(int primoPrelievo) {
		this.primoPrelievo = primoPrelievo;
	}



	public int getSecondoDeposito() {
		return getPrimoPrelievo() + secondoDeposito;
	}



	public void setSecondoDeposito(int secondoDeposito) {
		this.secondoDeposito = secondoDeposito;
	}



	public int getSecondoPrelievo() {
		return getSecondoDeposito() - secondoPrelievo;
	}



	public void setSecondoPrelievo(int secondoPrelievo) {
		this.secondoPrelievo = secondoPrelievo;
	}



	public int getCanonAnnuo() {
		return getSecondoPrelievo() *canonAnnuo/100;
	}



	public void setCanonAnnuo(int canonAnnuo) {
		this.canonAnnuo = canonAnnuo;
	}

	public int getSaldoAttuale() {
		return getSecondoPrelievo() - getCanonAnnuo();
	}

	public static void main(String[] args) {
		NewBank bank = new NewBank();
		bank.setCanonAnnuo(10);
		bank.setSaldo(500);
		bank.setPrimoDeposito(50);
		bank.setPrimoPrelievo(30);
		bank.setSecondoDeposito(100);
		bank.setSecondoPrelievo(40);
		System.out.println("SALDO ATTUALE: "+ bank.getSaldoAttuale());
	}

}
