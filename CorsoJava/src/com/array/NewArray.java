package com.array;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {

		
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Inserisci un numero: ");
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.print("Indice da rimuovere (0-4): ");
//        int pos = scanner.nextInt();
//
//        if (pos < 0 || pos >= arr.length) {
//            System.out.println("Posizione non valida!");
//        } else {
//            int[] nuovo = new int[arr.length - 1];
//            for (int i = 0, j = 0; i < arr.length; i++) {
//                if (i != pos) {
//                    nuovo[j++] = arr[i];
//                }
//            }
//
//            System.out.println("Array dopo la rimozione:");
//            for (int num : nuovo) {
//                System.out.println(num);
//            }
//        }

		
// Inserisci 5 numeri interi e stampali con Scanner
//		Scanner scanner = new Scanner(System.in);
//		
//		int[] num = new int[5];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("Inserisci un numero" );
//			num[i] = scanner.nextInt();
//		}
//		System.out.println("numeri inseriti");
//		for ( int n : num) {
//			System.out.println(n);
//		}
		
// Inserisci stringhe e stampa
//		Scanner scanner = new Scanner(System.in);
//		String[] parola = new String[5];
//		for (int i = 0; i < parola.length; i++) {
//			System.out.println("Inserisci un colore" );
//			parola[i] = scanner.nextLine();
//		}
//		System.out.println("colori inseriti");
//		for ( String n : parola) {
//			System.out.print(n +", ");
//		}
//		
		
//Calcola la somma degli elementi		
//	 Scanner scanner = new Scanner(System.in);
//	 int[] num = new int[3];
//	 int somma = 0;
//	 for (int i = 0; i < num.length; i++) {
//			System.out.println("Inserisci numero ");
//			num[i] = scanner.nextInt();
//		}
//				for (int in : num) {
//				somma += in;
//				}
//		System.out.println("la somma è: " +somma);
		
// Dato un array trova il massimo valore
//		Scanner scanner = new Scanner(System.in);
//		int[] numero = new int[5];
//		int max = 0;
//		for (int i = 1; i < numero.length; i++) {
//			System.out.println("Inserisci numero:");
//			numero[i] = scanner.nextInt();	
//			if ( numero[i] > max ) {
//				max = numero[i];
//			}
//		}
//		System.out.println("il velore è: " + max);
		
// Trova il minimo		
//		Scanner scanner = new Scanner(System.in);
//		int[] numero = new int[5];
//		for (int i = 1; i < numero.length; i++) {
//			System.out.println("Inserisci numero:");
//			numero[i] = scanner.nextInt();	
//		}
//		int min = numero[0];
//		for (int i = 1; i < numero.length; i++) {
//				
//			if ( numero[i] < min) {
//				min = numero[i];
//			}
//		}
//		System.out.println(min);
		
//	Stampa l’array al contrario	
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int[5];
//		
//		for( int i = 0; i < num.length; i++) {
//			System.out.println("Inserisci numero:");
//			num[i] = scanner.nextInt();	
//		}
//		for( int i = num.length - 1; i >= 0; i--) {
//			System.out.println(num[i]);
//		}
		
//Calcola la media
//	 Scanner scanner = new Scanner(System.in);
//	 int [] numeri = new int[4];
//	 int somma = 0;
//	 double media;
//	 for (int i = 0; i < numeri.length; i++) {
//		 System.out.println("Inserisci numeri");
//		 numeri[i] = scanner.nextInt();
//		 somma += numeri[i];
//	 }
//	 media = somma / numeri.length;
//	 System.out.println("la media è:" +media);
		
// Copia l’array in un nuovo array
//		Scanner scanner = new Scanner(System.in);
//		int [] numeri = new int[4];
//		 System.out.println("Inserisci 5 numeri: ");
//		 for (int i = 0; i < numeri.length; i++) {
//		 System.out.println("Numero " +(i+1) + ": ");
//		 numeri[i] = scanner.nextInt();
//		 }
//		 int[] arrCopia = new int[5];			
//		 for (int i = 0; i < numeri.length; i++) {
//				arrCopia[i] = numeri[i];
//			System.out.println("il secondo array contiene" +arrCopia[i]);
//			}
// ALTRA SOLUZIONE 
//		Scanner scanner = new Scanner(System.in);
//        int[] original = new int[5];
//
//        for (int i = 0; i < original.length; i++) {
//            System.out.print("Inserisci un numero: ");
//            original[i] = scanner.nextInt();
//        }
//
//        int[] copia = new int[5];
//        for (int i = 0; i < original.length; i++) {
//            copia[i] = original[i];
//        }
//
//        System.out.println("Array copiato:");
//        for (int num : copia) {
//            System.out.println(num);
//        }
		
// CONTA I NUMERI PARI
//		Scanner scanner = new Scanner(System.in);
//		int[] original = new int[5];
//		int count = 0;
//		for (int i = 0; i < original.length; i++) {
//          System.out.print("Inserisci un numero: ");
//         original[i] = scanner.nextInt();
//		if (original[i] %2 == 0) {
//			count++;
//			}
//		}
//		System.out.println("i numeri pari sono:" +count);
		
//		Inserisci 5 nomi e stampali
//		Scanner scanner = new Scanner(System.in);
//		String[] parola = new String[5];
//		for (int i = 0; i < parola.length; i++) {
//			System.out.println("Inserisci un colore" );
//			parola[i] = scanner.nextLine();
//			}
//		for (String j : parola) {
//		System.out.print( j + "");
//		scanner.close();
//		}
		
//Scambia primo e ultimo elemento
//		Scanner scanner = new Scanner(System.in);
//		int[] ele = new int[5];
//		for (int i = 0; i < ele.length; i++) {
//			System.out.println("Inserisci il numero");
//			ele[i] = scanner.nextInt();
//		}
//		int spazio = ele[ele.length -1];
//		ele[ele.length - 1] = ele[0];
//		ele
//Cerca un numero
		
//Conta le occorrenze di un numero
//		int[] r2 = {10,20,10,8,5};
//		int n = 10;
//		int theta = 0;
//		for (int t:r2) {
//			if (t == n) {
//				theta++;
//			}
//		System.out.println("il numero di occorrenze è: ".concat(String.valueOf(theta)));
//		}
		
// Conta il numero di elementi pari in un array.
//		int[] r2 = {10,20,10,8,5};
//		for (int i = 0; i < r2.length; i++) {
//			if (r2[i] %2 == 0) {
//				System.out.println(r2[i] +" è pari");
//			} else {
//				System.out.println(r2[i] +" è dispri");
//			}
//			}

//
		}
}
