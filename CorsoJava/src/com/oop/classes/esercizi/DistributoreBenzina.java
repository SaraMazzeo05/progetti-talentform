package com.oop.classes.esercizi;



/*Progettare una classe di nome DistributoreBenzina, per rappresentare un
distributore di carburante per automobili. Tale classe prevede due variabili
d'istanza. La prima chiamata deposito, di tipo double, e contiene il
quantitativo di benzina disponibile al distributore. La seconda, chiamata
euroPerLitro, di tipo double, rappresenta il prezzo della benzina, espresso in
euro per litro.
La classe deve implementare un costruttore public DistributoreBenzina(double
unPrezzoPerLitro), che prende come parametro esplicito il prezzo in euro per un
litro di benzina. La quantita' iniziale di benzina disponibile e' zero. La

classe deve inoltre implementare i seguenti metodi: public void
rifornisci(double unaQuantita), che rifornisce il distributore di benzina.
public void vendi(double euro, Car unaAutomobile) che vende una quantita' di
benzina corrispondente all'ammontare di euro pagato che va a rifornisce
l'automobile passata come parametro esplicito. public void aggiorna(double
unPrezzoPerLitro), che aggiorna il prezzo della benzina.
Consigli:
Si noti che nel metodo vendi(double euro, Car unAutomobile) il secondo parametro
esplicito unAutomobile è un oggetto della classe Car dell’esercizio 3.3 che deve
essere costruito con il costruttore della classe Car, di conseguenza, si possono
sfruttare i metodi della classe Car.
Nel Tester create varie automobili e un distributore. Fate compiere alcuni
"viaggi" alle automobili, e rifornitele di benzina in modo appropriato. Inoltre,
rifornite la pompa di benzina in caso di necessità.
public
*/


/*Modificare la classe DistributoreBenzina, assegnata nell’esercizio 3.3, in modo
che il distributore abbia due pompe, una di benzina ed una di gasolio. Ciascun
tipo di carburante ha il suo costo per litro. Conseguentemente, dovrete
raddoppiare il metodo rifornisci: dovrete avere un metodo per rifornire la
40
benzina ed un metodo per rifornire il gasolio. Il metodo vendi deve essere
modificato nel seguente modo: public void vendi(double euro, CarFuel
unaAutomobile). Tale metodo rifornisce l'automobile specificata come parametro
esplicito nel modo appropriato (benzina oppure gasolio). Nel Tester create varie
automobili e distributori. Fate compiere alcuni "viaggi" alle automobili, e
rifornitele di benzina in modo appropriato. Inoltre, rifornite le pompe di
benzina in caso di necessita'.
Consigli:
L’unico metodo difficoltoso è vendi, in quanto viene dato come parametro
esplicito un oggetto della classe CarFuel (esercizio 5.10). Per sapere con quale
combustibile funziona l’auto e per rifornirla si devono applicare i metodi della
classe a cui appartiene l’oggetto. Quindi si useranno il metodo usaBenzina() e
il metodo aggiungiCarburante(e come parametro un double che sia il numero di
litri da aggiungere al serbatoio), della classe CarFuel.
 
 */
public class DistributoreBenzina {
    
    private double depositoBenzina = 0; //quantitativo benzina disponibile
    private double depositoGasolio = 0;
    private double prezzoGasolio = 0; //prezzo benzina euro per litro
    private double prezzoBenzina = 0;
    private boolean benzina;
    
    public DistributoreBenzina(double prezzoBenzina, double prezzoGasolio) {
    
        this.prezzoBenzina = 0;
        this.prezzoGasolio = 0;
    }
    
    
    
    public void rifornisciBenzina(double unaQuantita) {
        
        this.depositoBenzina += unaQuantita;
    }
    
    public void rifornisciGasolio(double unaQuantita) {
        
        this.depositoGasolio += unaQuantita;
    }
    
    public void vendi(double euro, Car2 c) {
        
        double litriDaTogliereBenzina = 0;
        double litriDaTogliereGasolio = 0;
        
        if(c.usaBenzina() == true) {
            
            litriDaTogliereBenzina = euro / prezzoBenzina;
            
            if(litriDaTogliereBenzina <= this.depositoBenzina) {
                
                depositoBenzina -= litriDaTogliereBenzina;
                c.aggiungiCarburante(litriDaTogliereBenzina);
                
            }
        } else {
            
            litriDaTogliereGasolio = euro / prezzoGasolio;
            
            if(litriDaTogliereGasolio <= this.depositoGasolio) {
                
                depositoGasolio -= litriDaTogliereGasolio;
                c.aggiungiCarburante(litriDaTogliereGasolio);
            }
        }
    }
    
    public void reimpostaPrezziCarburanti(double tariffaGasolio, double tarriffaBenzina) {
        
        this.prezzoGasolio = tariffaGasolio;
        this.prezzoBenzina = tarriffaBenzina;
    }
    
    public double getLitriBenzina() {
        
        return this.depositoBenzina;
    }
    
    public double getLitriGasolio() {
        
        return this.depositoGasolio;
    }
    
    public double getPrezzoBenzina() {
        
        return this.prezzoBenzina;
    }
    
    public double getPrezzoGasolio() {
        
        return this.prezzoGasolio;
    }
    }
