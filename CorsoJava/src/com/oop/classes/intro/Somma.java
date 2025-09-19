package com.oop.classes.intro;

public class Somma {
	
	private int numDaSommare1;
	private int numDaSommare2;
	private int somma;
	
	
	

	public Somma(int numDaSommare1, int numDaSommare2, int somma) {
		
		this.numDaSommare1 = numDaSommare1;
		this.numDaSommare2 = numDaSommare2;
		this.somma = somma;
	}


	public int getSomma() {
		return numDaSommare1 + numDaSommare2;
	}

	public static void main(String[] args) {
		 Somma somma = new Somma(4, 4, 0);
		 System.out.println(somma.getSomma());
	}

}
