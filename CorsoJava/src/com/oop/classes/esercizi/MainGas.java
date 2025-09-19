package com.oop.classes.esercizi;

public class MainGas {

	public static void main(String[] args) {
		Car car = new Car(30);
		car.addGas(10);
		car.drive(150);
		
		System.out.println("Carburante rimanente: " + car.getGas());
	
		Car2 car2 = new Car2("benzina", 50, 20);
		System.out.println();
		car2.aggiungiCarburante(12);
		car2.faiUnGiro(10);
		
	}

}
