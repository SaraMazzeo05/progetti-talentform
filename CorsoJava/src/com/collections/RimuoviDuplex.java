package com.collections;

import java.util.ArrayList;
import java.util.List;

//1. Rimuovere tutti i duplicati senza usare Set
//Esercizio: Scrivi un metodo che rimuove i duplicati da un ArrayList<Integer> mantenendo l’ordine.
public class RimuoviDuplex {

	public static void main(String[] args) {
		ArrayList<String> nomi = new ArrayList<String>(List.of("Maria","Sara","Giacomo","Giorgio"));
		ArrayList<String> copia = new ArrayList<String>();
		for(String s : nomi) {
			if (!copia.contains(s)) {
				copia.add(s);
			}
		}
		System.out.println(copia);
	}
}
