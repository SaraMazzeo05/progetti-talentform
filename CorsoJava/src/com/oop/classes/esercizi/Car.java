package com.oop.classes.esercizi;
/*
Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni
o in litri/chilometri: scegliete il sistema che preferite) e una certa quantità
di carburante nel serbatoio. La resa è specificata dal costruttore e il livello
iniziale del carburante è a zero. Fornire questi metodi: un metodo drive per
simulare il percorso di un’automobile per una certa distanza, riducendo il
livello di carburante nel serbatoio; un metodo getGas, per ispezionare il
livello corrente del carburante; un metodo addGas per far rifornimento.
Consigli:
S’invita a porre particolare attenzione al metodo drive(double km), che calcola
il livello di carburante dopo un certo percorso.
*/

public class Car {

	protected double resaCarburante;
	protected double gas;
	
	
	public void drive(double Km) {
		 gas = gas - (Km / resaCarburante);
	}

	public double getResaCarburante() {
		return resaCarburante;
	}

	public void setResaCarburante(double resaCarburante) {
		this.resaCarburante = resaCarburante;
	}

	public double getGas() {
		return gas;
	}

	public void addGas(double rifornimento) {
		gas += rifornimento;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	
	
	public Car(double KmL) {
		super();
		this.resaCarburante = KmL;
		this.gas = 0;
	}
}
