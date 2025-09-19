package com.local.classes;

public class Welcome {
	
	public Welcome(String testo) {
		class Messaggio {
			public void saluta() {
				System.out.println("Ciao e "+testo);
			}
		}
		Messaggio mes = new Messaggio();
		mes.saluta();
	}
	
	public static void main(String[] args) {
		
		new Welcome("benvenuto.");
	}

}
