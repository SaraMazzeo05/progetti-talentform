package com.lambda.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;



public class MainLambda {

	public static void main(String[] args) {
//		List<String> names = List.of("Anna","Luca","Marta");
//		names.forEach(n -> System.out.println(n));
		
//		List<Integer> interi = List.of(1,2,3,4,5);
//		interi.forEach(num -> System.out.print(num));
		
//		List<String> citta = List.of("Roma", "Venezia", "Padova");
//		citta.forEach(c -> System.out.println(c));
	
//Somma di due numeri con BiFunction
//		BiFunction<Integer, Integer, Integer> somma = (a,b) -> a + b;
//		System.out.println(somma.apply(1, 2));
		
//Moltiplica due numeri
//		BiFunction<Integer, Integer, Integer> risultato = (a,b) -> a * b;
//		System.out.println(risultato.apply(10, 1));
		
//Sottrai due numeri
//		BiFunction<Integer, Integer, Integer> risultato = (a,b) -> a - b;
//		System.out.println(risultato.apply(10, 1));

//Verifica se un numero è pari con Predicate
//		Predicate<Integer> pari = (a) -> a %2 == 0;
//		System.out.println(pari.test(4));
//		System.out.println(pari.test(7));
		
//verifica i numeri dispari
//		Predicate<Integer> pari = (a) -> a %2 != 0;
//		System.out.println(pari.test(4));
//		System.out.println(pari.test(7));

//Convertire stringhe in maiuscolo con Function
//		Function<String, String> converti = (a) -> a.toUpperCase();
//		System.out.println(converti.apply("ciao"));
		
//Stampare messaggio usando Consumer	
//		Consumer<String> messaggio = (a) -> System.out.println(a);
//		messaggio.accept("Hello");
		
//Fornire valori con Supplier
//		Supplier<Double> a = () -> (Math.random());
//		System.out.println(a.get());
		
//Filtrare lista con stream e lambda
//		List<Integer> lista = List.of(1,2,3);                                  
//		lista                                                                  
//		    .stream().filter(a -> a>1)                                         
//		    .forEach(elementoFiltrato -> System.out.println(elementoFiltrato));
	
//Incrementare valori in una lista con map
//		List<Integer> lista = List.of(1,2,3,4,5); 
//		List<Integer> listaPlus = lista.stream().map(n ->n+1).collect(Collectors.toList());
//		System.out.println(listaPlus);
		
//Ordinare lista di stringhe con lambda
//		List<String> lista = new ArrayList<>(Arrays.asList("A","C","E","D","B"));
//		lista.sort((a,b) -> a.compareTo(b));
//		System.out.println(lista);

//Moltiplicare tutti gli elementi con map
//	    List<Integer> numeri = Arrays.asList(1, 2, 3, 4);   
//	    List<Integer> numeriMoltiplicati = numeri.stream().map(n -> n * 2).toList();      
//	    System.out.println("I numeri di partenza sono: " + numeri);
//	    System.out.println("I numeri moltiplicati sono: " + numeriMoltiplicati);
	        
//Filtrare parole lunghe	
		
//Usare BiConsumer per stampare chiave e valore
//		HashMap<String, Integer> valori = new HashMap(Map.of("Maria",15, "Luca", 16, "Mario",13, "Gina",30));
//		BiConsumer<String, Integer> stampa = (a,b) -> System.out.println("La chiave è: "+a+ " mentre il valore è: " +b);
//		valori.forEach(stampa);
		
//Contare elementi con filter

//Somma di numeri con reduce
//		List<Integer> n = new ArrayList<>(List.of(2,3));
//		int somma = n                                   
//		    .stream()                                   
//		    .reduce(-1, (a,b)->(a+b));                  
//		System.out.println(somma);
		
//Trovare il massimo con lambda
//		List<Integer> n = new ArrayList<>(List.of(2,3,6,7,1));
//		int max = n.stream().max((a,b) -> a.compareTo(b)).get();
//		System.out.println(max);
		
//Verificare se almeno un elemento soddisfa condizione
//		List<Integer> n = new ArrayList<>(List.of(2,3,6,7,1));
//		boolean condizione = n.stream().anyMatch(a -> a %2 == 0);
//		System.out.println(condizione);
		
//Creare un Supplier di valori casuali
//		Supplier<Double> valori = () -> (Math.random());
//		System.out.println(valori.get());
		
//Concatenare stringhe con reduce
//		List<String> n = List.of("Ciao, ", "come stai?");
//		String frase = n.stream().reduce("",(a,b) -> a+""+b.trim());
//		System.out.println(frase);
		
//Filtrare numeri dispari e sommarli		
//		List<Integer> n = new ArrayList<>(List.of(2,3,6,7,1));
//		int somma = n.stream().filter(num -> num %2 != 0).mapToInt(Integer :: intValue).sum();
//		System.out.println(somma);
		
//Ottenere lista di stringhe maiuscole
//		List<String> lista = new ArrayList<>(List.of("Ciao", " come stai?"));
//		List<String> frase = lista.stream().map(String :: toUpperCase).collect(Collectors.toList());
//		System.out.println(frase);
		
//Filtrare parole lunghe e ordinarle
//	       List<String> parole = new ArrayList<>(List.of("hello", "world", "How", "Are", "you"));
//	        List<String> order = parole.stream().filter(word -> word.length() > 3).sorted().collect(Collectors.toList());
//	        System.out.println(order);

//Contare numeri maggiori di 10
//		List<Integer> n = new ArrayList<>(List.of(20,3,60,70,1));
//		long count = n.stream().filter(a -> a > 10).count();
//		System.out.println(count);
		
//Trova il numero massimo usando reduce
//		List<Integer> n = new ArrayList<>(List.of(20,3,60,70,1));
//		int maxValue = n.stream().reduce(Integer :: max).get();
//		System.out.println(maxValue);
		
//Rimuovi i duplicati e ordinali
//		List<Integer> n = new ArrayList<>(List.of(20,3,60,70,1));
//		List<Integer> r = n.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(r);

//Creare mappa parola -> lunghezza
//		HashMap<String, Integer> map = new HashMap<>();           
//		String str1 = new String("prova");                        
//		map.put(str1, str1.length());                             
//		String str2 = new String(" provaaaa");                    
//		map.put(str2, str2.length());                             
//		System.out.println(map);                                  
//		                                                          
//		//Concatenare parole usando reduce                        
//		List<String> parole = new ArrayList<>();                  
//		for (Map.Entry<String, Integer> entry : map.entrySet()) { 
//		    String parola = entry.getKey();                       
//		    parole.add(parola);                                   
//		}                                                         
//Concatenare parole usando reduce		                                                          
//		System.out.println(parole);                               
//		String frase = parole                                     
//		                .stream()                                 
//		                .reduce("", (a,b) -> a.concat(b));        
//		System.out.println(frase);
		
//Filtrare numeri pari e moltiplicarli per 2
//		List<Integer> numeri = List.of(1,2,3,4); 
//		numeri                                   
//		    .stream()                            
//		    .filter(a -> a % 2 == 0)             
//		    .map(b -> b*2)                       
//		    .forEach(c -> System.out.println(c));
		
//Ordinare lista di stringhe per lunghezza
//		List<String> lista = new ArrayList<>(List.of("Ciao", " come stai?"));
//		lista.sort((a,b) -> Integer.compare(a.length(), b.length()));
//		System.out.println(lista);
		
//Altra soluzione
//		List<String> words = new ArrayList<>(List.of("apple","cat","banana","dog"));
//        words.sort((a,b) -> a.length() - b.length());
//        System.out.println(words); // [cat, dog, apple, banana]
	
//Trovare la parola più lunga
//		List<String> words = List.of("Java","Stream","Lambda");
//        String longest = words.stream().max((a,b) -> a.length() - b.length()).get();
//        System.out.println(longest); // Stream o Lambda

//Verificare se tutti i numeri sono positivi
//		List<Integer> numeri = List.of(1,2,3,4); 
//		boolean positivi = numeri.stream().allMatch(n -> n > 0);
//		System.out.println(positivi);
		
//Verificare se almeno un numero è multiplo di 5
//		List<Integer> numeri = List.of(1,2,3,4); 
//		boolean multipli = numeri.stream().anyMatch(n -> n %5 == 0);
//		System.out.println(multipli);
		
//Stampare tutti i numeri con forEach e lambda
//		List<Integer> numeri = List.of(1,2,3,4); 
//		numeri.forEach(a -> System.out.println(a));
		
//Trovare la somma usando reduce
//		List<Integer> numeri = List.of(1,2,3,4); 
//		int somma = numeri.stream().reduce(0, (a,b) -> a +b);
//		System.out.println(somma);
		
//Filtrare stringhe che contengono "a"
//		List<String> words = List.of("Oslo","Stream","Lambda");
//		List<String> listaA = words.stream().filter(a -> a.contains("a")).collect(Collectors.toList());
//		System.out.println(listaA);
		
//Convertire lista di numeri in lista di stringhe
//		List<Integer> numeri = List.of(1,2,3,4); 
//		List<String> converti = numeri.stream().map(a -> "num:" + a).collect(Collectors.toList());
//		System.out.println(converti);
		
//Ordinare mappe per valore
//        HashMap<String, Integer> map1 = new HashMap<>(Map.of("A", 3, "B", 2, "C", 1));
//        map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
//                .forEach(a -> System.out.println("CHIAVE: " + a.getKey() + " VALORE: " + a.getValue()));
    
//Ottenere lista di quadrati dei numeri
//		List<Integer> n1 = List.of(75,12,38);
//		List<Integer> nM = n1.stream().map(n -> n * n).collect(Collectors.toList());
//        System.out.println(n1);
//        System.out.println(nM);
		
//Raggruppare parole per lunghezza		
//		List<String> parole = List.of("a","bc","def","ghil");
//      Map<Integer,List<String>>Grouped = parole.stream().collect(Collectors.groupingBy(String :: length));
//      System.out.println(Grouped);
		
		
	}
}
