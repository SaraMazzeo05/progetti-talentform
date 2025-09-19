package com.controlflow;

import java.time.LocalDate;
import java.util.Locale;

public class EseData {

	public static void main(String[] args) {
		//LOCAL DATE
		//Stampa la data di oggi.
//				LocalDate oggi = LocalDate.now();
//				System.out.println(oggi);

		//Crea e stampa una data: 3 settembre 2025.
//				LocalDate data = LocalDate.of(2025, 9, 3);
//				System.out.println(data);
				
		//Aggiungi 30 giorni alla data corrente e stampa la nuova data.
//				LocalDate oggi = LocalDate.now();
//				LocalDate nwDate = oggi.plusDays(30);
//				System.out.println(nwDate);
				
		//Stampa il numero di giorni tra oggi e il 31 dicembre 2025.
//				LocalDate oggi = LocalDate.now();
//				LocalDate dic = LocalDate.of(2025, 12, 31);
//				
//				long giorni = ChronoUnitLocalDate oggi = LocalDate.now();
//				LocalDate dic = LocalDate.of(2025, 12, 31);
//				
//				long giorni = ChronoUnit.DAYS.between(oggi, dic);
//				System.out.println(giorni);.DAYS.between(oggi, dic);
//				System.out.println(giorni);
				
		//Controlla se il 31 dicembre 2024 è una data passata.
//				LocalDate passata = LocalDate.of(2024, 12, 31);
//				boolean controllo = passata.isBefore(LocalDate.now());
//				System.out.println("Il 31 dicembre è passato da: " + controllo);
				
		//Stampa l’anno, il mese e il giorno dalla data di oggi.
//				System.out.println(LocalDate.now().getYear());
//				System.out.println(LocalDate.now().getDayOfMonth());
//				System.out.println(LocalDate.now().getMonth());

		//Controlla se l’anno della data odierna è bisestile.
//				LocalDate annoC = LocalDate.now();
//				boolean bisestile = annoC.isLeapYear();
//				System.out.println("Lanno corrente" +annoC.getYear() + "è  bisestile? " +bisestile);

		//Data di nascita 2010-04-5, calcola l’età attuale.
//				LocalDate dataN = LocalDate.of(2010, 4, 5);
//				LocalDate oggi = LocalDate.now();
//				Period eta = Period.between(dataN, oggi);
//				System.out.println(eta.getYears());
				
		//Stampa il giorno della settimana per il 4 settembre 2025.
//				LocalDate data = LocalDate.of(2025, 9, 4);
//				DayOfWeek giorno = data.getDayOfWeek();
//				System.out.println(giorno);
				
		//Stampa oggi e i prossimi 4 giorni consecutivi.
//				LocalDate oggi = LocalDate.now();
//				for (int i = 0; i < 5; i++) {
//					System.out.println("Giorno " + (i + 1) + ": " + oggi.plusDays(i));
//				}
				
		//Stampa la data e l’ora correnti usando LocalDateTime
//				LocalDate oggi = LocalDate.now();
//				LocalDateTime ora = LocalDateTime.now();
//				System.out.println("oggi è " +oggi+ " e sono le ore: " +ora.getHour());
			
		//Calcola i minuti tra 14:15 e 16:45
//				long minuti = ChronoUnit.MINUTES.between(LocalTime.of(14, 15), LocalTime.of(16, 45));
//				System.out.println(minuti);
				
		//Formatta la data 2025-03-10 nel formato 10/03/2025.
//				LocalDate data = LocalDate.of(2025, 3, 10);
//				System.out.println("la dara formattata standard è "+ data);
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				System.out.println("Data Formattata " + data.format(formatter));
				
//Trova il numero di giorni tra 2025-01-01T00:00 e la data corrente.
		
//Stampa il nome del mese corrente in italiano (maiuscolo).
//		String mese = LocalDate.now().getMonth().getDisplayName(java.time.format.TextStyle.FULL,Locale.ITALIAN);
//		System.out.println("nome del mese corrente in italiano " + mese.toUpperCase());
	}

}
