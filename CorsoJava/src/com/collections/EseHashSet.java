package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EseHashSet {

	public static void main(String[] args) {
//		HashSet<String> citta = new HashSet<String>();
//		citta.add("Roma ");
//		citta.add("Milano ");
//		citta.add("Venezia ");
//		citta.add("Napoli ");
//		
//		
//		
//		HashSet<String> regione = new HashSet<String>();
//		regione.add("Lazio ");
//		regione.add("Lombardia" );
//		regione.add("Veneto ");
//		regione.add("Campania ");
//		
//		
//		citta.addAll(regione);
//		for(String i : citta) {
//			System.out.print(i);
//		}
		
		
//Trova gli elementi comuni tra due HashSet.
//		HashSet<String> citta = new HashSet<String>(List.of("Milano", "Roma", "Torino"));
//		HashSet<String> citta1 = new HashSet<String>(List.of("Lucera", "Roma", "Torino"));
//	
//		citta.retainAll(citta1);
//		
//		for(String i : citta) {
//			System.out.println(i);
//		}
		
//Trova gli elementi presenti in set1 ma non in set2.
//		HashSet<String> citta = new HashSet<String>();
//		citta.add("Roma ");
//		citta.add("Milano ");
//		citta.add("Venezia ");
//		citta.add("Napoli ");
//		
//		HashSet<String> citta1 = new HashSet<String>();
//		citta1.add("Roma ");
//		citta1.add("Firenze" );
//		citta1.add("Lucera ");
//		citta1.add("Matera ");
//		
//		citta.removeAll(citta1);
//		citta.retainAll(citta1);//stampa quelli uguali
//		
//		System.out.println(citta);

//Converti un HashSet<String> in ArrayList<String>.	
//		HashSet<String> hashSetI = new HashSet<>();                                       
//		hashSetI.add("mario");                                                            
//		hashSetI.add("gigi");                                                             
//		//List<String> listI = new ArrayList<>(hashSetI); //prima strategia               
//		List<String> listI = new ArrayList<>(); //altra strategia                         
//		listI.addAll(hashSetI);                                                           
//		for (String l:listI) {                                                            
//		    System.out.println(l);                                                        
//		}                                                                                                                                                              
//		System.out.println("#########################################################");                                                                            
//		int[] aaa = {10,40,50};                                                           
//		int[] listJ = Arrays.copyOf(aaa, aaa.length);                                     
//		for (int u:listJ)                                                                 
//		    System.out.println(u);                                                                                                                                    
//		System.out.println("#########################################################");                                                                              
//		//Verifica se due HashSet sono uguali.                                            
//		HashSet<String> hashSetUI = new HashSet<>(Set.of("A","B","C"));                   
//		HashSet<String> hashSetTI = new HashSet<>(Set.of("A","B","C"));                   
//		System.out.println(hashSetUI.equals(hashSetTI) ? "sono uguali" : "sono diversi");
		
//crea l'unione di due insiemi con HashSet
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5));
//		HashSet<Integer> num1 = new HashSet<>(Set.of(6,7,8,9,10));
//		HashSet<Integer> num3 = new HashSet<>(num);	
//		num3.addAll(num1);		
//		System.out.println(num3);
		
//Crea un Intersezione di due insiemi
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5,6));
//		HashSet<Integer> num1 = new HashSet<>(Set.of(6,4,7,8,9,10));
//		HashSet<Integer> intersezione = new HashSet<>(num);
		
//		intersezione.retainAll(num1);
//		System.out.println(intersezione);
		
//Crea la differenza tra due insiemi		
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5,6));
//		HashSet<Integer> num1 = new HashSet<>(Set.of(6,4,7,8,9,10));
//		HashSet<Integer> differenza = new HashSet<>(num);
//		differenza.removeAll(num1);
//		System.out.println(differenza);

//verifica il sottoinsieme
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5,6));
//		HashSet<Integer> num1 = new HashSet<>(Set.of(6,4,7,8,9,10));		
//		System.out.println("num1 è sottoinsieme di num? " +num.containsAll(num1));
			
//Rimuovi tutti gli elementi pari di un HashSet	
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5,6));
//		num.removeIf(x -> x %2 == 0);
//		System.out.println(num);
		
//Verifica se due set sono disgiunti(diversi).
//		HashSet<Integer> num = new HashSet<>(Set.of(1,2,3,4,5,6));
//		HashSet<Integer> num1 = new HashSet<>(Set.of(6,4,7,8,9,10));
//		System.out.println(num.equals(num1));
		
//Rimuovi tutti gli elementi maggiori della media	
//		HashSet<Integer> a = new HashSet<>(Set.of(10,20,30,60,90));
//		int media = 0;                                             
//		for (Integer c:a)                                          
//		    media += c;                                            
//		media /= a.size();                                         
//		HashSet<Integer> tmp = new HashSet<>();                    
//		for (Integer b:a)                                          
//		    if (b>media)                                           
//		        tmp.add(b);                                        
//		a.clear();                                                 
//		a.addAll(tmp);                                             
//		System.out.println(a);
		
//Verifica se due HashSet contengono esattamente gli stessi elementi
//		HashSet<Integer> a = new HashSet<>(Set.of(10,30,40));
//		Integer[] b = a.toArray(new Integer[3]);             
//		System.out.println(Arrays.toString(b));
//		HashSet<Integer> a = new HashSet<>(Set.of(40,10,20,30));        
//		int min = Collections.min(a);                                   
//		int max = Collections.max(a);                                   
//		System.out.println("il minimo è ".concat(String.valueOf(min))); 
//		System.out.println("il massimo è ".concat(String.valueOf(max)));
		
//Trova elemento minimo e massimo di un HashSet		
//		HashSet<Integer> a = new HashSet<>(Set.of(10,20,30,60,90));  
//		int media = 0;                                               
//		for (Integer c:a)                                            
//		    media += c;                                              
//		media /= a.size();                                           
//		HashSet<Integer> tmp = new HashSet<>();                      
//		for (Integer b:a)                                            
//		    if (b>media)                                             
//		        tmp.add(b);                                          
//		a.clear();                                                   
//		a.addAll(tmp);                                               
//		System.out.println(a);
		
//

		
	}
}
