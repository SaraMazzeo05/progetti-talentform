package com.oop.classes.esercizi;

public class CapoAbbigliamento extends TipoCapoAbbigliamento {

	private int taglia = 0;
	private int quantitaAcquistata = 0;
	private int quantitaDisponibile = 0;
	
	
	public CapoAbbigliamento(String marca, String modello, double costo, int taglia, int quantitaAcquistata, int quantitaDisponibile) {
		super(marca, modello, costo);
		this.taglia= taglia;
		this.quantitaAcquistata = quantitaAcquistata;
		this.quantitaDisponibile = quantitaDisponibile;
		
	}

	public void venduto(int capiVenduti) {
		int sottrazione = quantitaDisponibile - capiVenduti;
		if(quantitaDisponibile > sottrazione) {
			quantitaDisponibile -= capiVenduti;
		}
	}
	
	public void getDettagli() {
		System.out.println("La marca è: "+this.marca);
		System.out.println("Il modello è: "+this.modello);
		System.out.println("Il prezzo: "+this.costo);
		System.out.println("Taglia: "+this.taglia);
		System.out.println("La quantità acquistata è: "+this.quantitaAcquistata);
		System.out.println("La quantità disponibile è: "+this.quantitaDisponibile);
	}
}
