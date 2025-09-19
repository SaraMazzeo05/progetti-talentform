package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EseHashMap {

	public static void main(String[] args) {
		
//Crea un HashMap che associa un nome a un'età. 
//Inserisci tre coppie e stampale.
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		System.out.println(dati);
		
//Stampa l’età di "Anna" dal HashMap.
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Anna", 9);
//		System.out.println(dati.get("Anna"));

		
//Rimuovi "Luca" dal dizionario.
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 9);	
//		dati.remove("Luca");
//		System.out.println(dati);
		
//Verifica se una chiave esiste
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 9);			
//		System.out.println(dati.containsKey("Roberto"));
//		if (dati.containsKey("Roberto")) {
//			System.out.println("è presente");
//		}else {
//			System.out.println("non è presente");
//		}
		
//Controlla se c’è qualcuno con età 30.
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);
//		System.out.println(dati.containsValue(30));
		
//Stampa tutte le chiavi del HashMap.	
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);		
//		for (String chiave : dati.keySet()) {
//			System.out.println(chiave);
//		}
		
//Stampa tutti i values della mappa
		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);
//		System.out.println(dati.values());
		
//Stampa ogni nome con la rispettiva età.
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);
//		for (String i : dati.keySet()) {
//            System.out.println(i);
//        }
//        for (Integer i : dati.values()) {
//            System.out.println(i);
//        }
//        for (String i : dati.keySet()) {
//            System.out.println("NOME: " + i + " ETA: " + dati.get(i));
//        }
		
//Stampa il numero di elementi nel HashMap.	
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);	
//		System.out.println(dati.size());

//Svuota la mappa e verifica se e vuota		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);
//		dati.clear();
//		System.out.println(dati.isEmpty());
		
//Crea una HashMap<Integer, Integer> dove la chiave è un numero da 1 a 5 
//e il valore è il suo quadrato.
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 1; i <6 ;i++) {
//			map.put(i, i*i);
//		}
//		System.out.println(map);
		
//Trova la chiave con valore massimo
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Sara", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);
//		
//		int maxEta = -1;
//		String maxNome = null;
//		for(String chiave : dati.keySet()) {
//			if(dati.get(chiave) > maxEta) {
//				maxEta = dati.get(chiave);
//				maxNome = chiave;
//			}
//		}
//		System.out.printf(maxNome, maxEta);
//Altra soluzione
//		HashMap<String, Integer> original = new HashMap<>(Map.of("A", 3, "B", 6, "C", 9));
//		String maxKey = Collections.max(original.entrySet(),Map.Entry.comparingByValue()).getKey();
//		System.out.println(maxKey);
//Minimo
//		String minKey = Collections.min(original.entrySet(),Map.Entry.comparingByValue()).getKey();
//		System.out.println(minKey);
		
//Aggiungi "Sara" solo se non è già presente
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Anna", 8);
//		dati.put("Michele", 6);
//		dati.put("Roberto", 18);	
//		dati.put("Luca", 30);		
//		dati.putIfAbsent("Sara", 5);
//		System.out.println(dati);
		
//Dati due array, uno con nomi e uno con età,
//crea una mappa.
//		String[] nomi = {"Michele", "Roberto", "Giacomo"};
//		int[] eta = {18,20,32};
//		HashMap<String,Integer> persone = new HashMap<>();
//		for (int i = 0; i < eta.length; i++) {
//			 persone.put(nomi[i], eta[i]);
//		}
//		System.out.println(persone);
//Conta le occorrenze di parole in una frase
//		String frase = "Questo è un esempio di una frase";
//		HashMap<String, Integer> conteggio = new HashMap<>();
//		for (String i : frase.split(" ")) {
//			conteggio.put(i, conteggio.getOrDefault(i, 0)+1);
//		}
//		System.out.println(conteggio);
		
//Inverti chiavi e valori
//		HashMap<String, Integer> original = new HashMap<>(Map.of("Anna", 8, "Michele", 6, "Roberto", 18, "Luca", 30));
//		HashMap<Integer, String> inverti = new HashMap<>();
//	
//		for (Map.Entry<String, Integer> i : original.entrySet()) {
//			inverti.put(i.getValue(), i.getKey());
//		}
//		System.out.println(inverti);
// Altra soluzione
//		for(String nomi : nomiEta3.keySet()) { 			
//			nomiEta4.put(nomiEta3.get(nomi), nomi);
//		}
		
//Unisci due mappe sommando i valori
//		HashMap<String, Integer> original = new HashMap<>(Map.of("A", 3, "B", 6, "C", 9));
//		HashMap<String, Integer> original2 = new HashMap<>(Map.of("D", 4, "E", 7, "F", 10));
//		HashMap<String, Integer> original3 = new HashMap<>(original);
//		for(Map.Entry<String, Integer> entry : original2.entrySet()) {
//            original3.merge(entry.getKey(), entry.getValue(), Integer::sum);
//        }
//        System.out.println("La nuova mappa, mostra i seguenti valori: " + original3);
			
//Altra soluzione 1
//			for(String chiave : mappa2.keySet()) {
//				if(!mappa1.containsKey(chiave)) {
//					mappa1.put(chiave, mappa2.get(chiave));
//				}
//			}
		
//Altra soluzione 2
//		for(Map.Entry<String, Integer> entry : original2.entrySet()) {
//            original3.merge(entry.getKey(), entry.getValue(), Integer::sum);
//        }
//        System.out.println("La nuova mappa, mostra i seguenti valori: " + original3);
	
//Rimuovi le entry con valori inferiori a una soglia
//		HashMap<Integer, Integer> mappa = new HashMap<>(Map.of(1,10,2,20,3,30));
//		int soglia = 20;
//		mappa.values().removeIf(x-> x < soglia);
//		System.out.println("La mappa con soglia: "+ soglia);
	
//Ordina la mappa per chiave	
//		HashMap<String, Integer> mappa = new HashMap<>(Map.of("C", 3, "A", 6, "B", 9));
//		TreeMap<String, Integer> mappa2 = new TreeMap<>(mappa);
//		System.out.println(mappa2);
		
//Ordina la mappa per valore
//        HashMap<String, Integer> map = new HashMap<>(Map.of("B", 7, "A", 5, "C", 6));
//        TreeMap<String, Integer> map2 = new TreeMap<>(map);
//        System.out.println("mappa" + map2);
//        List<Map.Entry<String, Integer>> map3 = new ArrayList<>(map.entrySet());
//        map3.sort(Map.Entry.comparingByValue());
//        System.out.println("Mappa ordinata: " + map3);

//Crea una mappa da due liste
//		List<Integer> a = new ArrayList<>(List.of(1,2,3));
//		List<String> b = new ArrayList<>(List.of("A","B","C"));
//		HashMap<Integer, String> ab = new HashMap<>();
//		for (int i = 0; i < a.size(); i++) {
//			ab.put(a.get(i), b.get(i));
//		}
//		System.out.println(ab);

//Trova tutte le chiavi con un certo valore
//		HashMap<String, Integer> map = new HashMap<>(Map.of("A", 1, "B", 2, "C", 1, "D", 3));
//		int target = 1;
//		ArrayList<String> array = new ArrayList<>();
//		for (var i : map.entrySet()) 
//		if (i.getValue() == target) {
//				array.add(i.getKey());
//			}
//		}
//		System.out.println(array);
		
//Conta le frequenze di caratteri in una stringa
//		String frutta = "Pesca";
//		HashMap<Character, Integer> conto = new HashMap<>();
//		for (char i : frutta.toCharArray()) {
//			conto.put(i, conto.getOrDefault(i, 0)+1);
//		}
//		System.out.println(conto);
		
//Rimuovi le chiavi se soddisfano una condizione
//		HashMap<Integer,String> map = new HashMap<>();                                         
//		map.put(1, "aaaaa");                                                                   
//		map.put(2, "bbbb");                                                                    
//		map.put(3, "ccccccccccccccccccccccccc");                                               
//		map.put(4, "dd");                                                                      
//		                                                                                       
//		int chiaviConStringaPiùLunga = 0;                                                      
//		for (Map.Entry<Integer, String> entry:map.entrySet()) {                                
//		    int chiave_attuale = entry.getKey();                                               
//		    String valore_attuale = entry.getValue();                                          
//		                                                                                       
//		    if (chiaviConStringaPiùLunga == 0) {                                               
//		        chiaviConStringaPiùLunga = chiave_attuale;                                     
//		    } else {                                                                           
//		        if (valore_attuale.length() > map.get(chiaviConStringaPiùLunga).length()) {    
//		            chiaviConStringaPiùLunga = chiave_attuale;                                 
//		        }                                                                              
//		    }                                                                                  
//		}                                                                                      
//		System.out.println("la chiave con la stringa più lunga è " + chiaviConStringaPiùLunga);

//Rimuovi le entry con valori inferiori a una soglia                   
//		int soglia = 20;                                                       
//		HashMap<Integer, Integer> map = new HashMap<>(Map.of(1,10,2,20,3,30)); 
//		map.values().removeIf(x -> x < soglia);                                
//		System.out.println("mappa con soglia" + map);    
		

		
			
	}
}
