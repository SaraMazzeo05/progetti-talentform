package com.oop.classes.esercizi;



	/*
	Modificare la classe Car2, assegnata nell’esercizio 3.4, in modo tale che la
	macchina riconosca il tipo di carburante che consuma(benzina o gasolio).
	Implementate inoltre i seguenti metodi: void aggiungiCarburante(double litri)
	che aggiunge carburante al serbatoio della macchina. void faiUnGiro(double
	kilometri) che simula una corsa di un'auto per un determinato numero di km.
	boolean usaBenzina() che restituisce se il carburante della macchina è benzina.
	boolean usaGasolio() che restituisce se il carburante della macchina è gasolio.
	double getSerbatoio()che restituisce il numero di litri di carburante rimanenti
	nel serbatoio. String getTipoDiCarburante() che restituisce il tipo di
	carburante della macchina.
	*/


	public class Car2 {

		protected double resa;
		protected double serbatoio;
		protected boolean benzina;
		
		
		public void aggiungiCarburante(double litri) {
			serbatoio += litri;
		}
	
		public void faiUnGiro(double kilometri) {
			double carburanteConsumato = kilometri / resa;
			if(carburanteConsumato <= serbatoio) {
				serbatoio-= carburanteConsumato;
			}
		}
		
		
		public boolean usaBenzina() {
			return benzina;
		}
		
		public boolean usaGasolio() {
			return !benzina;
		}
		
		public double getSerbatoio() {
			return serbatoio;
		}
		
		public String getTipoCarburante() {
			String tipoCarburante;
			if (benzina == true) {
				tipoCarburante = "benzina";
			}else {
				tipoCarburante = "gasolio";
			}
			return tipoCarburante;
		}
		
		public Car2(String unCarburante, double unaResa, double litri) {
			serbatoio = litri;
			resa = unaResa;
			if (unCarburante.equalsIgnoreCase("benzina")== true) {
				benzina = true;
			}else {
				benzina = false;
			}
		}
	}

