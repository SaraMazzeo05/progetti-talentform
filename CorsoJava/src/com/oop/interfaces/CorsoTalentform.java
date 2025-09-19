package com.oop.interfaces;

public class CorsoTalentform implements ICorsoTalentform {
	
	private String durataCorso;
	private String tecnologiaCorso;
	private int numeroStudentiCorso;
	private String modalitaCorso;
	
	

	public CorsoTalentform(String durataCorso, String tecnologiaCorso, int numeroStudentiCorso, String modalitaCorso) {
		super();
		this.durataCorso = durataCorso;
		this.tecnologiaCorso = tecnologiaCorso;
		this.numeroStudentiCorso = numeroStudentiCorso;
		this.modalitaCorso = modalitaCorso;
	}

	@Override
	public String getDurataCorso() {
		
		return durataCorso;
	}

	@Override
	public String getTecnologieCorso() {
	
		return tecnologiaCorso;
	}

	@Override
	public int getNumeroStudentiCorso() {
		
		return numeroStudentiCorso;
	}

	@Override
	public String getModalitaCorso() {
	
		return modalitaCorso;
	}

	public static void main(String[] args) {
	
		CorsoTalentform corso = new CorsoTalentform ("248 ORE", "BACKEND-FRONTEND", 15,"ONLINE");
		System.out.println("Durata del corso: "+corso.getDurataCorso());
		System.out.println("Tecnologia corso: "+corso.getTecnologieCorso());
		System.out.println("Numero studenti: "+corso.getNumeroStudentiCorso());
		System.out.println("Modalità del corso: "+corso.getModalitaCorso());
	
	}

}
