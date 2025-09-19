package com.methods;

public class AnagraficaDati {
	
	public String getAnagrafica (String nome, String cognome) {
		return nome + " " + cognome;
	}

	public int getAnagrafica (int anni) {
		return anni;
	}
	
	public long getAnagrafica (long telefono) {
		return telefono;
	}
	
	public static void main(String[] args) {
		
		AnagraficaDati dati = new AnagraficaDati();
		String nome = "Gino";
		String cognome = "Rossi";
		int anni = 38;
		long telefono = 331445869;
		
		System.out.println(dati.getAnagrafica(nome, cognome));
		System.out.println(dati.getAnagrafica(anni));
		System.out.println(dati.getAnagrafica(telefono));
	}

}
