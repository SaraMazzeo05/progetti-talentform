package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class EseIterator {

	public static void main(String[] args) {
		
//Stampa tutti gli elementi di una lista utilizzando Iterator    
//      List<String> persona = Arrays.asList("Paolo", "Giovanni", "Luca");
//      Iterator<String> ti = persona.iterator();
//      while ( ti.hasNext()) {
//          System.out.println(ti.next());
//	}
		
//Verifica se un elemento è presente
//      List<String> colors = new ArrayList<>(Arrays.asList("blue","red","green"));
//      Iterator<String> it = colors.iterator();
//      boolean isIn = false;
//      while (it.hasNext()) {
//          if (it.next().equals("blue")) {
//              isIn = true;
//              break;
//          }
//      }
//      System.out.println("E' presente: " + isIn);

//Rimuovi tutti gli elementi minori di 10 da un set
        
//		HashSet<Integer> numeri = new HashSet<>(List.of(20,5,40,6));
//		Iterator<Integer> iter = numeri.iterator();
//		while(iter.hasNext()) {
//			if (iter.next()<10) {
//				iter.remove();
//			}
//		}
//		System.out.println(numeri);
		
// Conta quante parole iniziano con "a"
//       HashSet<String> parole = new HashSet<>(List.of("Macchina","Albero", "Mela", "Appendice","Bici"));
//       Iterator<String> iter = parole.iterator();
//       int conta = 0;
//       while(iter.hasNext()) {
//    	   if(iter.next().startsWith("A")) {
//    		   conta++;
//    	   }
//       }
//       System.out.println(conta);
		
//Stampa chiavi e valori di una mappa
//		Map<String, Integer> mappa = new HashMap<>(Map.of("A",1, "B",2, "C",3));
//		Iterator<Entry<String, Integer>> iter = mappa.entrySet().iterator();
//		while(iter.hasNext()) {
//			Map.Entry<String,Integer> map = iter.next();
//			System.out.println(map);
//			System.out.println(iter.next().getValue() +" "+ iter.next().getKey());
//		}	
			
// Rimuovi tutte le entry con valore sotto 50
//		Map<String, Integer> numeri = new HashMap<>(Map.of("A",10, "B",200, "C",300));;
//		Iterator<Entry<String, Integer>> iter  = numeri.entrySet().iterator();
//		while(iter.hasNext()) {
//			Map.Entry<String, Integer> num2 = iter.next();
//			 if (num2.getValue()<50) {
//				 iter.remove();
//			 }
//		}
//		System.out.println(numeri);
		
//
	}
}
