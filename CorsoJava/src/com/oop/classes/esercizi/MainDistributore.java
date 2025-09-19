package com.oop.classes.esercizi;

public class MainDistributore {

    public static void main(String[] args) {

        
        DistributoreBenzina distributore = new DistributoreBenzina(1.60, 1.53);
            
        Car2 benzina = new Car2("Benzina", 30, 20);
        
        Car2 gasolio = new Car2("Gasolio", 20, 30);
        
        distributore.rifornisciBenzina(70);
        distributore.rifornisciGasolio(70);
        
        distributore.vendi(20, benzina);
        distributore.vendi(30, gasolio);
        
        System.out.println("Il quantitativo di benzina rimanente è: " + distributore.getLitriBenzina());
        System.out.println("Il quantitativo di gasolio rimanente è: " + distributore.getLitriGasolio());
        
        System.out.println("");
        
        distributore.reimpostaPrezziCarburanti(1.70, 1.59);
        
        System.out.println("Il prezzo della benzina è: " + distributore.getPrezzoBenzina());
        System.out.println("Il prezzo del gasolio è: " + distributore.getPrezzoGasolio());
    }
}


