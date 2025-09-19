package com.controlflow;

public class EseSwitch {

	public static void main(String[] args) {
		// SWITCH CASE
		// Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.
//				int giorno = 3;
		//
//		        switch (giorno) {
//		            case 1:
//		                System.out.println("Lunedì");
//		                break;
//		            case 2:
//		                System.out.println("Martedì");
//		                break;
//		            case 3:
//		            	System.out.println("Mercoledì");
//		            	break;
//		            case 4:
//		            	System.out.println("Giovedì");
//		            	break;
//		            case 5:
//		                System.out.println("Venerdì");
//		                break;
//		            case 6:
//		                System.out.println("Sabato");
//		                break;
//		            case 7:
//		                System.out.println("Domenica");
//		                break;
//		            default:
//		                System.out.println("non sono giorni della settimana");
//		      }
				
		// Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno).
//				int mese = 4;
//				switch (mese) {
//				case 12: case 1: case 2: 
//					System.out.println("inverno");
//					break;
//				case 3: case 4: case 5:
//					System.out.println("primavera");
//					break;
//				case 6: case 7: case 8:
//					System.out.println("estate");
//					break;
//				case 9: case 10: case 11:
//					System.out.println("autunno");
//					break;
//				default:
//					System.out.println("mese non trovato");
//				}
				
		// Simula un menu di un ristorante (switch per scegliere tra 3 piatti).
				
//				String scelta = "Pizza";
//				switch (scelta.toLowerCase()) {
//				case "pasta":
//					System.out.println("pasta al pomodoro");
//					break;
//				case "orecchiette":
//					System.out.println("orecchiette al forno");
//					break;
//				case "lasagna":
//					System.out.println("lasagna");
//					break;
//				default:
//					System.out.println("non hai fame");
//				}
			
		//Simula una calcolatrice base con switch (+, -, *, /).
				
//			double a = 20;
//			double b = 2.5;
//			char operatore = '+';
//			double risultato;
		//	
//			switch (operatore) {
//				case '+':
//					risultato = a + b;
//					System.out.println("il risultato è " + risultato);
//					break;
//				case '-':
//					risultato = a - b;
//					System.out.println("il risultato è " + risultato);
//					break;
//				case '/':
//					if (b != 0) {
//					risultato = a / b;
//					System.out.println("il risultato è " + risultato);
//					} else {
//						System.out.println("Non se pò fà.");
//					}
//					break;
//				case '*':
//					risultato = a * b;
//					System.out.println("il risultato è " + risultato);
//					break;
//				}
				
		//Dato un codice prodotto, usa uno switch per mostrare nome e prezzo.
				
//				String codiceP= "0012MB";
//				switch(codiceP) {
//				case "0013CC":
//					System.out.println("T-Shirt bianca: 7 £");
//					break;
//				case "0016FF":
//					System.out.println("Pantalone palazzo nero: 18,20 £");
//					break;
//				case "0012MB":
//					System.out.println("Trench avorio: 57,56 £");
//					break;
//				default:
//				System.out.println("non ho trovato il codice");
//				}
				
		// Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).
			
//				int eta = 35;
//				String biglietto;
//				
//				if (eta <= 10) {
//					biglietto= "junior";
//				}else if (eta <= 60) {
//					biglietto="adulto";
//				} else {
//					biglietto="senior";
//				}
//				switch (biglietto) {
//				}
				
		//Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
//				int mese = 1;
//				switch (mese) {
//				case 1: case 4: case 6: case 9:
//					System.out.println("Il mese ha 30 giorni");
//					break;
//				case 2:
//					System.out.println("Il mese ne ha 28 di giorni");
//					break;
//				case 3: case 5: case 7: case 8: case 10: case 11: case 12:
//					System.out.println("Il mese ha 31 giorni");
//					break;
//				default:
//					System.out.println("mese non trovato");
//				}
				
		//Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente
		 
//				char voto = 'A';
//				int punteggio = 0;
//					switch(voto) {
//					case 'A': punteggio = 10; break;
//					case 'B': punteggio = 8; break;
//					case 'C': punteggio = 6; break;
//					case 'D': punteggio = 4; break;
//					case 'E': punteggio = 2; break;
//					}
//					System.out.println("il tuo voto corrisponde al pnteggio " + punteggio);

	}

}
