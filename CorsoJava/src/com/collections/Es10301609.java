package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Es10301609 {

    //Ordina gli studenti in base all’età crescente.
    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Mario", "Rossi", 23));
        studenti.add(new Studente("Gennaro", "Verdi", 21));
        studenti.add(new Studente("Paolo", "Bianchi", 40));

        studenti.sort(Comparator.comparingInt(s -> s.getEta()));
        
        for (Studente s:studenti)
            System.out.println(s);
    }
    
}