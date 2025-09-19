package com.collections;

import java.util.ArrayList;
import java.util.Collections;
//Sostituisci il primo elemento di un ArrayList di stringhe 
//con un altro valore

public class ArrayListSostituisci {

	public static void main(String[] args) {
		ArrayList<String> colori = new ArrayList<String>();
		colori.add("viola");
		colori.add("azzurro");
		colori.add("nero");
		
		colori.set(0, "rosso");
		
		System.out.println(colori.size());
		for (String i : colori) {
			System.out.println(i);
		}

	}

}
