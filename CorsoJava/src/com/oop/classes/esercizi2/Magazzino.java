package com.oop.classes.esercizi2;



public class Magazzino extends CapoAbbigliamento{
	
	
	private String marca;
	private String modello;
	private float costo;
	private int taglia;
	private int quantitaAcquista;
	private int quantitaDisponibile;
	
	


	public Magazzino(String marca, String modello, float costo, int taglia, int quantitaAcquista,
			int quantitaDisponibile) {
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
		this.taglia = taglia;
		this.quantitaAcquista = quantitaAcquista;
		this.quantitaDisponibile = quantitaDisponibile;
	}




	@Override
	public int getVenduto() {
		
		return 0;
	}

	@Override
	public void dettagli() {
		System.out.println("La marca è: "+this.marca);
		System.out.println("Il modello è: "+this.modello);
		System.out.println("Il prezzo: "+this.costo);
		System.out.println("Taglia: "+this.taglia);
		System.out.println("La quantità acquistata è: "+this.quantitaAcquista);
		System.out.println("La quantità disponibile è: "+this.quantitaDisponibile);
	}

	@Override
	public float getCosto() {
		return costo;
	}
	
	
	@Override
	public void applicaSconto(float sconto) {
		costo = costo - (costo *sconto/100);
	}


	@Override
	public void modificaCosto(float nuovoCosto) {
		this.costo = nuovoCosto;
	}
	
	public void venduto(int capiVenduti) {
		int sottrazione = quantitaDisponibile - capiVenduti;
		if(quantitaDisponibile > sottrazione) {
			quantitaDisponibile -= capiVenduti;
		}
	}
	
	
	public static void main(String[] args) {

	
	}
	}

