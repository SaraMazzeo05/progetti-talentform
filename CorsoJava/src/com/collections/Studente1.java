package com.collections;

import java.util.ArrayList;

public class Studente1 {
	private String nome;
	private int eta;
	
	
	

	public Studente1(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}

	public int getEta() {
        return eta;
    }


	public static void main(String[] args) {
        ArrayList<Studente1> studenti = new ArrayList<>();
        studenti.add(new Studente1("Marco", 19));
        studenti.add(new Studente1("Lucia", 22));
        studenti.add(new Studente1("Giovanni", 21));
        studenti.add(new Studente1("Anna", 20));
        
//        studenti.removeIf(s -> s.getEta() < 20);       
//        System.out.println(studenti);
        
//        ArrayList<Studente1> studenti1 = new ArrayList<>();
//        studenti1.add(new Studente1("Serafino", 19));
//        studenti1.add(new Studente1("Luca", 22));
//        studenti1.add(new Studente1("Gianni", 21));
//        studenti1.add(new Studente1("Anna", 20));
       
//       studenti.addAll(studenti1);
//        for(Studente1 i : studenti) {
//        	System.out.println(i);
//        }
       
    }
}
