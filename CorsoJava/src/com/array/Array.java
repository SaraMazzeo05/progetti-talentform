package com.array;

public class Array {

	public static void main(String[] args) {

//		int[] array = new int[5];
//
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		array[3] = 40;
//		array[4] = 50;
//
//		System.out.println(array[2]);
//		System.out.println("-----------------");
//
//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		for (int in : arr) {
//
//			System.out.println(in);
//
//		}

		
		String [] nomi = new String[5];
		
		nomi[0] = "Alberto";
		nomi[1] = "Federica";
		nomi[2] = "Giuseppe";
		nomi[3] = "Anna";
		nomi[4] = "Lucia";
		
		System.out.println(nomi[4]);
		
		
		for (int i = 0; i < nomi.length; i++) {
			System.out.println(nomi[i]);
			
		}
		
		int[] age = {12, 24, 32, 8, 45};
		System.out.println(age[2]);
		
		for (int i : age) {
			System.out.println(i);
		}
	}
}
