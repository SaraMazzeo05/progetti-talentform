package com.controlflow;

import java.time.LocalDate;
import java.util.Scanner;

public class IfEse {

	public static void main(String[] args) {
		//Scrivi un programma che controlla se un numero è positivo o negativo
//		int numero1 = 5;
//		if(numero1>= 0) {
//			System.out.println("il numero è positivo");
//		} else {
//			System.out.println("il numero è negativo");
//		}
//		
// Verifica se un numero è pari o dispari.
//		int numero1 = 4;
//		if (numero1 % 2 == 0) {
//			System.out.println("il numero è pari");
//		} else {
//			System.out.println("il numero è dispari");
//		}
		
// Controlla se un utente è maggiorenne (>=18 anni).
//		int utente = 2;
//		if (utente >= 18) {
//			System.out.println("è maggiorenne");
//		} else {
//			System.out.println("non è maggiorenne");
//		}
		
// Dato un carattere, controlla se è una vocale o una consonante.
//		char carattere = 'a';
//		if(carattere == 'a'|| carattere =='e' || carattere == 'i'|| carattere == 'o' || carattere == 'u' || carattere == 'y') {
//			System.out.println("è una vocale");
//		} else {
//			System.out.println("è una consonante");
//		}
		
//		String controllo = carattere == 'a'|| carattere =='e' || carattere == 'i'|| carattere == 'o' || carattere == 'u' || carattere == 'y' ? "la lettera è una vocale" : "la lettera è una consonante";
//			System.out.println(controllo);
//	} EQUIVALENTE DELL IF "?". ":" ELSE

// Controlla se un numero è compreso tra 10 e 100.

//Dato il voto di uno studente, stampa "promosso" se >= 6, altrimenti "bocciato".		
		
//		double studente = 5.5;
//		if (studente >=6) {
//			System.out.println("promosso");
//		} else {
//			System.out.println("bocciato");
//		}
// Stabilisci il maggiore tra due numeri interi e se i numeri solo uguali.
		
//		int a = 10;
//		int b = 5;
	
//		String verifica = a<b ? "A è maggiore di B" : "B è maggiore di A";
//		System.out.println(verifica);
		
//Verifica se una stringa è vuota.
		
//		String parola = "";
	
//		String verifica = parola.isEmpty() ? "é vuota" : "non è vuota";
//		System.out.println(verifica);
		
//		Verifica se un numero è positivo, negativo o zero.
		
//		int numero = +10;
//		if (numero > 0) {
//			System.out.println("è positivo");
//		} else if (numero < 0 ){
//			System.out.println("è negativo");
//		} else  {
//			System.out.println("è 0");
//		}
		 
//		System.out.println(numero>0?numero+ "è positivo"
//								: numero<0?numero+ "e negativo"
//										: numero+ "è 0");

//Scrivi un programma che controlla se un numero è positivo o negativo.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("inserisci numero:");
//		int numero = scanner.nextInt();
//		if (numero > 0) {
//			System.out.println("è positivo");
//		} else {
//			System.out.println("è negativo");
//		}
		
// Verifica se un numero è pari o dispari.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("inserisci il numero:");
//		int numero = scanner.nextInt();
//		if (numero % 2 == 0) {
//			System.out.println("Il numero è pari");
//		} else {
//			System.out.println("il numero è dispari");
//		}

//Dato un carattere, controlla se è una vocale o una consonante.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci un carattere:");
//		String carattere = scanner.nextLine();
//		if (carattere == "a"|| carattere =="e" || carattere =="i" || carattere =="o" || carattere =="u"|| carattere =="y") {
//			System.out.println("è una vocale");
//		} else {
//			System.out.println("è una consonante");
//		}

		
// Controlla se un numero è compreso tra 10 e 100.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci il numero");
//		int numero = scanner.nextInt();
//		if (numero >= 10 && numero <= 100) {
//			System.out.println("il numero rientra");
//		} else {
//			System.out.println("non è compreso");
//		}
		
//Verifica se due numeri sono uguali.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci il primo numero");
//		int numero1 = scanner.nextInt();
//		System.out.println("inserisci il secondo numero");
//		int numero2 = scanner.nextInt();
//		if(numero1 == numero2) {
//			System.out.println("sono uguali");
//		} else {
//			System.out.println("non sono uguali");
//		}
		
// Stabilisci il maggiore tra due numeri interi.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci il primo numero");
//		int numero1 = scanner.nextInt();
//		System.out.println("inserisci il secondo numero");
//		int numero2 = scanner.nextInt();
//		if (numero1 > numero2) {
//			System.out.println("il numero: " +numero1+ " è maggiore di " +numero2);
//		} else if (numero1 < numero2) {
//			System.out.println("il numero: " +numero2+ " è maggiore di " +numero1);
//		} else {
//			System.out.println("i numeri sono uguali");
//		}
		
//Verifica se una stringa è vuota.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci qualcosa");
//		String stringa = scanner.nextLine();
//		if (stringa.isEmpty()) {
//			System.out.println("la stringa è vuota");
//		} else  {
//			System.out.println("la stringa contiene: "+stringa);
//		}
		
//Verifica se un numero è positivo, negativo o zero.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserisci il numero");
//		int numero = scanner.nextInt();
//		if (numero > 0) {
//			System.out.println("il numero è positivo");
//		} else if (numero < 0) {
//			System.out.println("il numero è negativo");
//		} else {
//			System.out.println("il numero è 0");
//		}
		
//Dato l'anno, verifica se è bisestile.
//		LocalDate dataOdierna = LocalDate.now();
//		if(dataOdierna.isLeapYear()) {
//		System.out.println("è bisestile");
//		} else {
//			System.out.println("non è bisestile");
//		}
		
//Dato un numero, stampa "divisibile per 2 e 3", "solo per 2", "solo per 3" oppure "nessuno".
//		System.out.println("Inserisci il numero");
//		int numero = scanner.nextInt();
//		if (numero %2 == 0 && numero %3 == 0) {
//			System.out.println("è divisibile per 2 e 3");
//		} else if ( numero %2 == 0)  {
//			System.out.println("è divisibile per 2");
//		} else {
//			System.out.println("non è divisibile per nessuno dei due");
//		}
		
//Confronta tre numeri e stampa il maggiore.
//		int num1 = 4;
//		int num2 = 5;
//		int num3 = 6;
//		if (num1 > num2 && num2 > num3) {
//			System.out.println("il numero " +num1+ " è maggiore di " +num2 +" e "+ num3);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("il numero " +num2+ " è maggiore di " +num1 +" e "+ num3);
//		} else if (num3 > num1 && num3 > num1) {
//			System.out.println("il numero " +num3+ " è maggiore di " +num1 +" e "+ num2);
//		} else {
//			System.out.println("errore");
//		}

//
	} 
}
