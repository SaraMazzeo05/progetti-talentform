package com.oop.classes.esercizi;

public class MainDipendente {

    public static void main(String[] args) {
        
        
        Dipendente  d = new Dipendente("a012", 1450.0f, 200.0f);
        
        
        System.out.println(d.paga(20));
        System.out.println(d.getStipendi());
        
        d.Stampa();
        
        
    }

}

