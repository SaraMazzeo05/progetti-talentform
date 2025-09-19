package com.oop.classes.wrapper;

public class ClassWrapper {

	public static void main(String[] args) {
	
		// BOXING 
		
		
		Integer number = new Integer(5);
	
		System.out.println(number);
		
		Double db =  Double.valueOf(25.30d);
		
		
		
		// AUTOBOXING 
		
		Integer numbers = 35;
		
		
		
		System.out.println(numbers);
		
		Double dbl = 22.5d;
		
		
		
		
		// UNBOXING 
		
		
		
		int nb = number;

		
		System.out.println(nb);
		
		
		double bl = db;
		
		System.out.println(bl);
		
		
		

	}

}
