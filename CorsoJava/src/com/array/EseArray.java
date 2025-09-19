package com.array;

public class EseArray {

	public static void main(String[] args) {
//Crea un array di interi e stampane ogni elemento.
//		int[] cod = new int[4];
//		cod[0] = 1111;
//		cod[1] = 2222;
//		cod[2] = 3333;
//		cod[3] = 4444;
//		for (int i = 0; i < cod.length; i++) {
//			System.out.print(cod[i] +" ");
//		}
//		String[] cod2 = {"AAA ", "BBB ", "CCC ", "DDD ", "EEE "};
//		System.out.println();
//		for (String i : cod2) {
//			System.out.print(i);
//		}
		

//Calcola la somma di tutti gli elementi di un array.
//		int[] num = { 2, 2, 3, 4 };
//		int somma = 0;
//				for (int in : num) {
//				somma += in;
//				}
//		System.out.println("la somma è: " +somma);
		
		
//Calcola la media aritmetica degli elementi di un array.
//		int[] num = { 2, 2, 3, 4 };
//		int media = 0;
//		int somma = 0;
//				for (int i = 0; i <num.length; i++) {
//				somma += num[i];
//				}
//		media = somma/num.length;
//		System.out.println(media);
		
//Trova il valore massimo in un array di interi
//		int[] num = { 2, 2, 3, 4 };
//		
//		int max = num [0];
//		for (int i = 1; i < num.length; i++) {
//			if ( num[i] > max ) {
//				max = num[i];
//			}
//		}
//		System.out.println("il velore è: " + max);
		
//Trova il valore minore in un array di interi.
//		int[] num = { 1, 2, 3, 4 };
//		
//		int min = num [0];
//		for (int i = 1; i < num.length; i++) {
//			if ( num[i] < min ) {
//				min = num[i];
//			}
//		}
//		System.out.println("il velore è: " + min);
		
//Conta il numero di elementi pari in un array.
//		int[] num = { 1, 2, 3, 4 };
//		int count = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.println("Gli elementi pari sono: " +count);
		
//Stampa gli elementi dell’array in ordine inverso.
//		int[] num = { 1, 2, 3, 4 };
//		for( int i = num.length - 1; i >= 0; i--) {
//			System.out.println(num[i]);
//		}
		

//Controlla se un numero dato (es. 10) è presente nell’array.
//		int[] num = { 4, 2, 6, 7 };
//		int nDaCer = 10;
//		boolean trovato = false;
//		
//		for (int n : num) {
//			if (n==nDaCer) {
//				trovato = true;
//				break;
//			}
//		}
//		if (trovato) {
//			System.out.println("Trovato" +nDaCer);
//		} else {
//			System.out.println("Non trovato");
//		}
		
//Conta quanti elementi nell’array sono maggiori di 10. 
//		int[] num = { 10, 20, 30, 40 };
//		int count = 0;
//		
//		for( int i : num) {
//			if (i > 10) {
//				count++;
//			}
//		}
//		System.out.println("i numeri maggiori di 10 sono:" +count);
		
// Copia tutti gli elementi di un array in un secondo array e stampalo.
//		int[] age = { 10, 20, 30, 40 };
//		int[] arrCopia = new int[5];
//		
//		for (int i = 0; i < age.length; i++) {
//			arrCopia[i] = age[i];
//			System.out.println(arrCopia[i]);
//		}
		
//Dato un array, calcola la differenza tra il valore massimo e minimo
	
//Scrivi un programma che trova la posizione del numero 9 nell’array.	

//Stampa solo gli elementi dispari presenti in un array.

//Controlla se gli elementi dell’array sono ordinati in ordine crescente.
	
//Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.	
//	 int [] array = {5,8,1,9,2,21};
//	 int somma = 0;
//	 int somma1 = 0;
//	 
//	 for (int i = 0; i < array.length; i++) {
//		 if (array[i] % 2 == 0) {
//			 somma += array[i];
//		 } else {
//			 somma1 += array[i];
//		 }
//	 }
//	 System.out.println(somma);
//	 System.out.println(somma1);
		
//Dato un array, crea un nuovo array con solo i numeri positivi.
//		int[] originali = {-2, 4, -1, 3, 0, 7};
//		int[] positivi = new int[originali.length];
//		int countPosizione = 0;
//		int posizione = 0;
//		
//		for (int i = 0; i < originali.length; i++) {
//			if (originali[i] > 0) {
//				countPosizione++;
//			}
//		}
//		for (int i = 0; i < originali.length; i++) {
//			if (originali[i] > 0) {
//				positivi[posizione++] = originali[1];
//			}
//		}
//		for (int pos : positivi) {
//			System.out.println(pos);
//		}
// ALTRA SOLUZIONE	
//		int[] originali = {-2, 4, -1, 3, 0, 7};
//        int[] positivi = new int[originali.length];
//        int j = 0;
//
//        for (int i = 0; i < originali.length; i++) {
//            if (originali[i] > 0) {
//                positivi[j] = originali[i];
//                j++;
//            }
//        }
//        for (int i = 0; i < j; i++) {
//            System.out.print(positivi[i] + " ");
//        }
		
// ALTRA SOLUZIONE 
//		int[] originali = {-2, 4, -1, 3, 0, 7};
//
//        // Filtra solo i numeri > 0 e crea un nuovo array
//        int[] positivi = Arrays.stream(originali)
//                               .filter(n -> n > 0)
//                               .toArray();
//
//        // Stampa il nuovo array
//        System.out.print("Numeri positivi: ");
//        for (int n : positivi) {
//            System.out.print(n + " ");
//        }
		
//Conta quante volte compare il numero 3 in un array.
//		int[] array = {1,2,3,4,5,6};
//		int contatore = 0;
//		for (int n : array) {
//			if (n == 3) {
//				contatore++;
//			}
//		}
//		System.out.println("in questo array è presente: " +contatore);
		
//Scambia tra loro il primo e l’ultimo elemento di un array.
//		int[] array = {1,2,3,4,5,6};
//		int j = array[array.length-1];
//		
//		array[array.length-1] = array[0];
//		array[0] = j;
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
//ALTRA SOLUZIONE
//		int[] array = {10, 20, 30, 40, 50};
//        int temp = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = temp;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//Conta quanti elementi dell’array sono maggiori della media.
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		int somma = 0;
//		int contatore = 0;
//		int media = 1;
//		for (int n : arr) {
//			somma += n;
//		}
// 		media = somma/arr.length;
//		for (int x : arr) {	
//		}
//Dato un array, stampa i numeri duplicati presenti.
		
//Crea un nuovo array con solo valori univoci.
	
		
//Sposta tutti gli zeri di un array alla fine, mantenendo l’ordine degli altri numeri. Esempio: {0, 5, 0, 3, 0, 1} → {5, 3, 1, 0, 0, 0}
//	 int[] array = {0, 5, 0, 3, 0, 1};
//	 int max = 1;
//	 for (int i = 0; i < array.length; i++) {
//		for (int j=i+1; j < array.length; j++) {
//			if (array[j] > array[max]) {
//				max = j;
//			}
//		}
//		int a = array[i];
//		int b = array[max];
//		array[i] = b;
//		array[max] = a;
//	 }
//	 for (int k : array)
//	 System.out.println(k);
// Conta quante volte due elementi consecutivi sono uguali.
//		int[] array = {0, 5, 0, 3, 0, 1};
//		int conteggio = 0;
//		
//		for (int p=0; p < array.length; p++) {
//			int corrente = array[p];
//			int successivo = array[p+1];
//			if (corrente == successivo) {
//				conteggio++;
//			}
//			System.out.println(conteggio);
//		}
	}
}
