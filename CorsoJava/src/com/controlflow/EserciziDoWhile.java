package com.controlflow;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class EserciziDoWhile {

	public static void main(String[] args) {
//Stampare i numeri da 1 a 10
//		int numero1 = 1;
//			do {
//				System.out.println(numero1);
//				numero1++;
//			} 
//			while (numero1<=10);
		
//Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo while
//		 	int number = 1;
//		    int numbers = 10;

//		while(number<=numbers) {
//
//		        System.out.println(number);
//		       number++;// INCREMENTO FIN QUANDO NON RAGGIUNGE 10
//		    }

// DECREMENTO DI 2 SU WHILE
//		int numero1 = 50;
//		int numero2 = 10;
		
//			while(numero1>numero2) {
//			System.out.println(numero1);
//				numero1 = numero1-2;
//			}
		
// Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando while.
	 
//		int somma = 0;
//		int i = 1;
//		while (i <= 100 ) {
//			somma += i;
//			i++;
//		}
//		System.out.println(somma);
		
//Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
//		int i = 2;
//		while (i<=20) {
//			System.out.println(i);
//			i+=2;
//		}
		
//Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
//	int numero = 3456;
//	int cif = 0;
//	int tmp = numero;
//	while (tmp > 0) {
//		tmp/=10;
//		cif++;
//	}
//	System.out.println("il numero" +numero+ "ha"+cif+ "cifre");
// ALTRA SOLUZIONE
//		int numero = 3456;
//        int cifre = 0;
//        while (numero > 0) {
//            numero /= 10;
//            cifre++;
//        }
//        System.out.println("Numero di cifre: " + cifre);
		
//Scrivi un programma che calcola la somma delle cifre di un numero intero positivo. Esempio 123 → 1 + 2 + 3 = 6.
//	int numero1 = 123;
//	int sommaip = 0;
//	
//	while (numero1 > 0) {
//		sommaip += numero1%10;
//		numero1/=10;
//	}
//	System.out.println(sommaip);
		
//	Scrivi un programma che inverte un numero intero positivo.Esempio: 1234 → 4321
	
//	int numero7= 1234;
//	int invert = 0;
//	
//	while(numero7 > 0) {
//		int cifra = numero7 % 10;
//		invert = invert*10+cifra;
//		numero7 /= 10;
//	}
//	System.out.println(invert);
		
// Scrivi un programma che stampa tutti i divisori di un numero intero positivo.Esempio: n = 12 → 1 2 3 4 6 12
		
//		int num1 = 12;
//		int i = 1;
//		while (i <= num1) {
//			if(num1 % i == 0) {
//				System.out.println(i);
//		}
//			i++;
//	}
//	System.out.println("");
		
// DO WHILE
//Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.	
		
//		int numero1 = 1;
//		int numero2 = 10;
		
//		do {
//            System.out.println(numero1);
//            numero1++;
//        } while (numero1 <= numero2);
		
//		do {
//			System.out.println(numero2);
//			numero2--;
//		}
//		while (numero2 >= numero1);
		
// Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
		
//		int a = 1;
//		int somma = 0;
//		do {
//			somma += a;
//			a++;
//		} while (a <= 100);
//		System.out.println("la somma è " + somma);
	
//Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5.
//		int numeroDaMolt = 1;
//		do {
//			System.out.println(numeroDaMolt + "x5=" + (numeroDaMolt * 5));
//			numeroDaMolt++;
//		} while (numeroDaMolt <= 10);

// Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.
//		int numero = 12345;
//		int cif = 0;
//		int tmp = numero;
//		do {
//			tmp/=10;
//			cif++;
//		}
//		while (tmp > 0); 
//		System.out.println("il numero " +numero+ " ha "+cif+ " cifre");
	
//Scrivi un programma che calcola base^esponente usando do-while. Esempio: 3^4 = 81
//	int base = 3;
//	int esponente = 4;
//	
//	int i=0;
//	int risultato = 1;
//	
//	do {
//		risultato*= base;
//		i++;
//	} while (i<esponente);
//	
//	System.out.println(i);

//Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
//        int i = 2;
//        while (i <= 20) {
//            System.out.print(i + " ");
//            i += 2;
//        }

// Stampa la tabellina del 4 da 1×4 a 10×4 usando while
//        int tabellina = 0;
//        while (tabellina <= 10) {
//        	System.out.println(tabellina + " x 4 = " + (tabellina * 4));
//            tabellina++;
//        }

//Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
//		int numero = 3456;
//        int cifre = 0;
//
//        while (numero > 0) {
//            numero /= 10;
//            cifre++;
//        }
		
//Scrivi un programma che calcola la somma delle cifre di un numero intero positivo.
//		int numero = 5698;
//		int somma = 0;
//		while (numero > 0) {
//			somma += numero % 10;
//			numero /= 10;
//		}
//		System.out.println(somma);
		
//Scrivi un programma che inverte un numero intero positivo.Esempio: 1234 → 4321
//		 int numero = 1234;
//		 int inverto = 0;
//		 while (numero >0) {
//			 int cifra = numero%10;
//			 inverto = inverto * 10 + cifra;
//	         numero /= 10;
//		 }
//		System.out.println(inverto);
		
//Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
//		int numero = 1;
//		do {
//			System.out.println(numero);
//			numero++;
//		} while (numero <= 10);
		
//Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
//		int numero = 1;
//		int somma = 0;
//		do {
//			somma += numero;
//			numero++;
//		} while (numero <= 100);
//		System.out.println("La somma è: " +somma);

//Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5
//		int tabellina = 1;
//		do {
//			System.out.println(tabellina + " x 5 = " + (tabellina * 5));
//			tabellina++;
//		} while (tabellina <= 10);

//Scrivi un programma che stampa i numeri pari da 2 a 20 usando.
//		int i = 2;
//		do {
//         System.out.print(i + " ");
//          i += 2;
//      } while (i <= 20);

//Scrivi un programma che somma tutte le cifre di un numero intero positivo. Esempio: 456 → 4 + 5 + 6 = 15.
//		int numero = 456;
//		int somma = 0;
//		do {
//			somma += numero %10;
//			numero /=10;
//		} while (numero > 0);
//		System.out.println(somma);

// Scrivi un programma che inverte un numero intero positivo. Esempio: 1234 → 4321
//		 int numero = 1234;
//		 int inverto = 0;
//		 do {
//			 int cifra = numero%10;
//			 inverto = inverto * 10 + cifra;
//	         numero /= 10;
//		 } while (numero >0);
//		System.out.println(inverto);
		
//
	}
}
		
