package com.oop.classes.esercizi;

public class Dipendente {
    
    protected String matricola;
    protected float stipendio;
    protected float straordinario;
    
    public Dipendente(String matricola, float stipendio, float straordinario) {
        super();
        this.matricola = matricola;
        this.stipendio = stipendio;
       this.straordinario = straordinario;
    }
    
    public float getStipendi(){
        return stipendio;
    }
    
    
    public float paga(int ore) {
        this.stipendio = ore * this.straordinario + this.stipendio;
        return this.stipendio;
    }
    
    public void Stampa() {
        System.out.println("La matricola del dipendente è: "+ matricola);
        System.out.println("Lo stipendio base del dipendente è: €" + stipendio);
        System.out.println("Lo staordinario del dipendente è di: €"+ straordinario);
    }
    

}
