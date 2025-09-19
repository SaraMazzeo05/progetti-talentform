package com.collections;
import java.util.*;
public class EsercizioHashSet {

	public static void main(String[] args) {
		HashSet<String> colori = new HashSet<String>();
		
		colori.add("Nero");
		colori.add("Viola");
		colori.add("Rosso");
		colori.add("Bianco");
		System.out.println("Colori presenti nell'HashSet:");
        for (String colore : colori) {
            System.out.print(colore);
        }
	}

}
