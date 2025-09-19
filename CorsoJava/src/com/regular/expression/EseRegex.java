package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EseRegex {

	public static void main(String[] args) {
		
		
//Scrivi un'espressione regolare per verificare se una stringa 
//contiene solo lettere (maiuscole e minuscole).
//		String parola = "Albero1";
//		boolean match = parola.matches("^[a-zA-Z]+$");
//		System.out.println(match);
		
//Controlla se una stringa contiene solo cifre numeriche.
//		String a = "1233";
//		boolean b = a.matches("^\\d+$");
//		System.out.println(b);
		
//Verifica se una stringa è un'email 
//valida del tipo nome@dominio.com.
//		String email = "ciaociao@mail.it";
//		boolean cm =email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
//		System.out.println(cm);
		
//Verifica se un numero di telefono 
//inizia con +39 e contiene 9-10 cifre.
//		String a = "+39123365678";
//		boolean n = a.matches("^\\+39\\d{9,10}$");
//		System.out.println(n);

//Verifica se una password contiene almeno una maiuscola, 
//una minuscola, un numero e almeno 8 caratteri.
//		String a = "Marcofgb1";
//		boolean b = a.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
//		System.out.println(b);
		
//Estrai tutte le parole di una stringa
//		String regex = "\\b\\w+\\b";                             
//		String parole = "prima seconda terza";                   
//		Matcher matcher = Pattern.compile(regex).matcher(parole);
//		while(matcher.find())                                    
//		    System.out.println(matcher.group());
		
//Sostituisci tutte le cifre in una stringa con l'asterisco *.
//		String inputA = "12334";
//		String outputA = inputA.replaceAll("\\d","*");
//		System.out.println(outputA);
		
//Estrai tutti gli indirizzi email da un testo.
//		String email = "ciaociao@mail.it afantastica@catcalling.it noreply@gmail.com";
//		Matcher matcher = Pattern.compile(("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}")).matcher(email);
//		while(matcher.find()) {
//			System.out.println(matcher.group());
//		}
		
//Verifica se una stringa è un CAP italiano valido (5 cifre).
//		String cap = "95040";
//		boolean a = cap.matches("^\\d{5}$");
//		System.out.println(a);
		
//Conta il numero di parole in una stringa.
//		String parole = "Ciao";
//		Matcher matcher = Pattern.compile(("\\b\\w+\\b")).matcher(parole);
//		int count = 0;
//		while (matcher.find()) {
//			count ++;
//			System.out.println(count);
//		}
		
//Controlla se una stringa è 
//un codice fiscale italiano (16 caratteri alfanumerici).
//	      String  cF = "PDLNDR97S11B180U";
//          boolean ck = cF.matches("^[A-Z0-9]{16}$");
//          System.out.println(ck);
		
//Estrai date in formato gg/mm/aaaa
//		String date = "Scadenza: 01/01/2025, rinnovo: 15/07/2026";
//		Matcher matcher = Pattern.compile(("\\b\\d{2}/\\d{2}/\\d{4}\\b")).matcher(date);
//		while (matcher.find()) {
//			System.out.println(matcher.group());
//		}
		
//Controlla se una stringa è 
//una targa italiana del tipo AB123CD.
//		String targa = "AB123CD";
//		boolean t = targa.matches("^[A-Z]{2}\\d{3}[A-Z]{2}$");
//		System.out.println(t);
	
//Rimuovi spazi doppi in una frase, 
//lasciando solo uno spazio tra le parole
//		String date = "Scadenza:  01/01/2025,  rinnovo: 15/07/2026";
//		Matcher matcher = Pattern.compile("\s\s").matcher(date);
//		while (matcher.find()) {
//			date = date.replace("  ", " ");
//		System.out.println(date);
//		}
//Con spazi multipli
//		String frase = "Questo    è   un    test";
//		String pulita = frase.replaceAll("\\s+", " ");
//		System.out.println(pulita); // Questo è un test

//Dividi una stringa usando virgole, 
//punti e punti e virgola come separatori.
//		String input = "uno,due;tre.quattro";
//		String[] parti = input.split("[,;.]");
//		for (String parte : parti) {
//		    System.out.println(parte);
//		}
		
//Verifica se una stringa è un’email valida con lettere, numeri, 
//underscore e dominio con minimo 2 caratteri.
//		String email = "questa_mail123@mail.com";
//		boolean m = email.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
//		System.out.println(m);
		
//Valida un numero di telefono internazionali
//Formato: +39 345 123 4567 o +1-202-555-0173
//		String numTel = "+1-202-555-0173";
//		boolean check = numTel.matches("^\\+\\d{1,3}[- ]?\\d{1,4}[- ]?\\d{3}[- ]?\\d{4}$");
//		System.out.println(check);

//Estrarre tutti gli hashtag da un testo
//		String testo = "Test #java #regex #esercizio";   
//		Matcher matcher = Pattern.compile("#\\w+").matcher(testo);      
//		while(matcher.find()) {
//	    System.out.println(matcher.group());
//		}

//Validare una password sicuraRegole: Minimo 8 caratteri, almeno una maiuscola
//una minuscola, un numero e un simbolo.
//	      String pass = "Passw12*";
//	      boolean p = pass.matches("^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%*?&]).{8,}$");
//	      System.out.println(p);
		
		
//Controllare codice IBAN
		 String  iban = "u34604833148244631178";
         boolean IcK = iban.matches("^[A-Z]{2}\\d{2}[A-Z0-9]{1,30}$");
         System.out.println(IcK);
		
	}
}
