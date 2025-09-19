package com.collections;

import java.util.*;

public class ExerciseArrayList {

	public static void main(String[] args) {
		List<String> technology = new ArrayList<String>();
		
		//AGGIUNGO ELEMENTI ALLA LISTA
		technology.add("java");
		technology.add("spring");
		technology.add("html");
		technology.add("javascript");
		technology.add("typescript");
		technology.add("css");
		//ORDINO LA LISTA 
		Collections.sort(technology);
		Collections.reverse(technology);
		
		for (String tech : technology) {
			System.out.println(tech);
		}
		System.out.println(technology.size());

	}

}
