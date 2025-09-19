package com.sintax;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teacher ="Fabio"; // DICHIARAZIONE ED INIZIALIZZAZIONE VARIABILE
		System.out.println(teacher);
		
		String brand = "Audi"; // VARIABILE ASSEGNAZIONE PER VALORE
		String model = brand; // VARIABILE ASSEGNAZIONE PER RIFERIMENTO
		
		System.out.println(brand);
		System.out.println(model);
		
		int number = 50;
		boolean logged = true;
		char fabio = 'f';
		double price = 100.500;
		float prices = 10.5f;
		
		String conversion = "22.5";
		double priceShoes = Double.parseDouble(conversion);
		System.out.println(priceShoes);
		
		String esercizio = "sono un esempio";
		System.out.println(esercizio.length() +" "+esercizio.toUpperCase());
		
		// CONCATENAZIONE DI STRINGHE
		String javascript = "javascript";
		String technology = "frontend";
		String res = javascript.concat(" " +technology);
		System.out.println(res);
		 // stampa originale
		String testoConSpazi = "  questo testo  ";
		System.out.println("Stringa originale: [" + testoConSpazi + "]");
        
        // Stampa con trim()
        String testoPulito = testoConSpazi.trim();
        System.out.println("Stringa dopo trim(): [" + testoPulito + "]");
        
        StringBuilder ciao = new StringBuilder("Ciao");
        ciao.append("come va?");
        System.out.println(ciao);
        
        StringBuilder ese = new StringBuilder("Questo è un esempio");
        ese.insert(4,"voi");
        
        StringBuilder gatto = new StringBuilder("Fuffolo");
        gatto.delete(2, 6);
        System.out.println(gatto);
        
        StringBuilder football = new StringBuilder("Football");
        football.reverse();
        System.out.println(football);
        
		
	}

}
