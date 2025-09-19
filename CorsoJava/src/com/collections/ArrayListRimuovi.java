package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Rimuovi il numero 15 da un ArrayList di interi
public class ArrayListRimuovi {

	public static void main(String[] args) {
//		ArrayList<Integer> numeri = new ArrayList<Integer>();
//		numeri.add(2);
//		numeri.add(3);
//		numeri.add(15);
//		
//		numeri.remove(2);
//		
//		for (int i : numeri) {
//			System.out.println(i);
//		}

		
//Ordina un ArrayList di numeri 
//in ordine crescente e decrescente
	
//		ArrayList<Integer> numeri = new ArrayList<Integer>();
//		numeri.add(2);
//		numeri.add(3);
//		numeri.add(15);
//		numeri.add(5);
//		
//		System.out.println("Questo è l'arraylist principale: "+numeri);
//		
//		Collections.sort(numeri);
//		System.out.println("L'arraylist in ordine crescente: "+numeri);
//		
//		Collections.sort(numeri, Collections.reverseOrder());
//		System.out.println("L'arraylist in ordine decrescente: "+numeri);

		
		
//Stampa l’ultimo elemento della lista di stringhe 
//senza utilizzare get
		
//		ArrayList<String> str = new ArrayList<String>();
//		str.add("Ciao");
//		str.add("Sono Lucia");
//		str.add("E sono una sirena");
//		
//		System.out.println(str.toString());
		

//Crea un ArrayList di caratteri dalla a alla z e crea un ordine decrescente 
//e determina la lunghezza della lista e verifica se la lista e vuota
//		ArrayList<Character> str = new ArrayList<Character>();
//		str.add('a');
//		str.add('b');
//		str.add('c');
//		str.add('d');
//		str.add('e');
//		str.add('f');
//		str.add('h');
//		str.add('i');
//		str.add('l');
//		str.add('m');
//		str.add('n');
//		str.add('o');
//		str.add('p');
//		str.add('q');
//		str.add('r');
//		str.add('s');
//		str.add('t');
//		str.add('u');
//		str.add('v');
//		str.add('z');
		
//		for (char ch = 'a'; ch <= 'z'; ch++) {
//            str.add(ch);
//        }
//		Collections.reverse(str);
//		System.out.println(str);
//		
//		System.out.println(str.size());
//		str.clear();
//		
//		System.out.println(str.isEmpty());
		
//Calcola la somma degli interi in un ArrayList e 
//copia tutti gli elementi da una lista ad un altra
//		ArrayList<Integer> interi = new ArrayList<>(Arrays.asList(40,20,30));
//        int somma = 0;
//        for (int intero:interi)
//            somma += intero;
//        System.out.println(somma);
//        
//        //List<Integer> listaCopiata = List.copyOf(interi);
//        //System.out.println(listaCopiata);
//        
//        //copia tutti gli elementi da una lista ad un altra
//        ArrayList<Integer> listaCopiata = interi;
//        System.out.println(listaCopiata);
//		
	
//Rimuovi il numero 15 da un ArrayList di interi.
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(1);
//		nums.add(2);
//		nums.add(3);
//		nums.add(10);
//		nums.add(15);
//		nums.add(15);
//		
//		System.out.println(nums.get(1));
//		
//		for ( Integer numeri : nums) {
//			if (numeri == 15) {
//				nums.remove(Integer.valueOf(15));
//			}
//		}
//		for (int i = 0; i < nums.size(); i++) {
//			if (nums.get(i) == 15) {
//				nums.remove(Integer.valueOf(15));
//			}
//		}
//	
//		System.out.println(nums);
		
		
//	Crea un ArrayList<ArrayList<Integer>> 
//contenente 3 liste di interi. Stampale.
		
//		ArrayList<ArrayList<Integer>> num = new ArrayList<>();
//		
//		ArrayList<Integer> numeri = new ArrayList<>(List.of(1,2,3,4,5,6));
//		
//		ArrayList<Integer> numeri1 = new ArrayList<>(List.of(7,8,9,10));
//		
//		ArrayList<Integer> numeri2 = new ArrayList<>(List.of(11,12,13,14));
//		
//		num.add(numeri);
//		num.add(numeri1);
//		num.add(numeri2);
//		for ( ArrayList<Integer> i : num) {
//			System.out.println(i);
//		}
//		
//		
//		ArrayList<ArrayList<String>> frase = new ArrayList<>();
//		
//		ArrayList<String> frase1 = new ArrayList<String>(List.of("ciao, come stai?"));
//		ArrayList<String> frase2 = new ArrayList<String>(List.of("Tutto bene, grazie."));
//		
//		frase.add(frase1);
//		frase.add(frase2);
//		for ( ArrayList<String> i : frase) {
//			System.out.print(i);
		//}		
//Trova elementi comuni tra due liste	
		
//		ArrayList<String> nomi1 = new ArrayList<String>(List.of("Maria","Simone","Giacomo"));
//		ArrayList<String> nomi2 = new ArrayList<String>(List.of("Marina","Simone","Fabio"));
//		ArrayList<String> nomi3 = new ArrayList<String>(nomi1);
//	
//		nomi3.retainAll(nomi2);
//		System.out.println(nomi3);
		
//Rimuovi tutti i valori maggiori della media
//		  List<Integer> num = new ArrayList<>(List.of(1,2,2,3,5,6,6,7));
//	        int maxL = 1;
//	        int L = 1;
//	        for (int i=1;  i < num.size(); i++) {
//	            if (num.get(i) > num.get(i-1)) {
//	                L++;
//	            }else {
//	                L=1;
//	            }
//	            maxL = Math.max(maxL, L);
//	        }
//	        System.out.println(maxL);
	    
//
	}
}
