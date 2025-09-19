package com.oop.classes.wrapper;

public class Esercizi {

	public static void main(String[] args) {
		
/*Dichiara una variabile int e 
assegnala a un oggetto Integer usando l'autoboxing.
*/
		
//		int a = 2;
//		Integer ab = a;
//		System.out.println(ab);
		
		
//Dichiara un oggetto Double e assegna il suo valore 
//a una variabile double primitiva. 
		
//		Double a = 5.5;
//		double n = a;
//		System.out.println(a);
		
		
		
// Converti la stringa "123" in un int 
//usando il metodo statico di Integer.
		
//		String a = "123";
//		Integer b = new Integer(a);
//		System.out.println(b);
		
//Converti la stringa "45" in un oggetto Integer.
		
//		String ab = "45";
//		Integer b = Integer.valueOf(ab);
//		System.out.println(b);
		
//Confronto tra wrapper
//Traccia: Crea due oggetti Integer con valore 1000 
//e verifica se sono uguali usando == e .equals().
		
//		Integer number = 1000;
//		Integer numbers = 1000;
//		System.out.println(number.equals(numbers));
		
//Converte la stringa "true" in un valore boolean.
//		String a = "true";
//		boolean b = Boolean.parseBoolean(a); //Valore(parse). Conversione non boxing
//		System.out.println(b);

//Converti la stringa "127" in un oggetto Byte.
//		String a = "127";
//		Byte b = Byte.valueOf(a);// Oggetto (valueOf)
//		System.out.println(b);
		
//– Character.isDigit()
//Traccia: Verifica se il carattere '9' è una cifra numerica.
//		char a = '9';
//		boolean b = Character.isDigit(a); // boolean di appoggio
//		System.out.println(b);
		
		
//Converti la stringa "3.14" in un valore float.
//		String e = "3.14";
//		float b = Float.parseFloat(e);
//		System.out.println(b);
	
//Confronta due valori Double usando Double.compare.
//		Double f = Double.valueOf(4.6d);
//		Double g = Double.valueOf(4.0d);
//		int check = Double.compare(f, g);
//		System.out.println(check);
		
//Converte la stringa "12345" in un oggetto Short.
//		String a = "12345";
//		Short b = Short.valueOf(a);
//		System.out.println(b);
		
//Converti un oggetto Integer in una stringa tramite concatenazione.
//		Integer a = 5;
//		String b = "" +a;
		
//Crea un array di oggetti Integer con i valori da 1 a 5 e itera con un foreach		
		Integer[] arr = {1,2,3,4,5};
//		Integer[] array = new Integer[10];
		for (Integer i : arr) {
			System.out.println(i);
		}
	
	}

}
