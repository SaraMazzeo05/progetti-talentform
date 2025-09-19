package com.array;

import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		
//        int[][] matrice = {
//                {1, 2, 3},
//                {4, 5, 6}
//            };
//
//            for (int i = 0; i < matrice.length; i++) {
//                for (int j = 0; j < matrice[i].length; j++) {
//                    System.out.print(matrice[i][j] + " ");
//                }
//                System.out.println();
//            }

		
//		
//		int [][] matrice = {
//				{2, 4},
//				{5, 6}
//		};
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//				System.out.println(matrice[i][j]);
//			}
//		}

//Somma tutti gli elementi di una matrice 3x3.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {4, 5, 6},
//				  {5, 6, 7}
//		};
//		int somma = 0;
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//			somma += matrice[i][j];
//			}
//		}
//		System.out.println("la somma è: " +somma);
		
//Trova il valore massimo in una matrice 3x2.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {4, 5}
//		};
//		int max = matrice[0][0];
//		for (int i = 0; i < matrice.length; i++) {
//          for (int j = 0; j < matrice[i].length; j++) {
//        		if ( matrice[i][j] > max ) {
//      				max = matrice[i][j];
//      			}
//     		}
//          }
//  		System.out.println("il valore è: " + max);

//Stampa la seconda colonna di una matrice 3x3.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {4, 5, 6},
//				  {5, 6, 7}
//		};
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//				if( i == 1)
//				System.out.print(matrice[i][j]);
//			}
//		}
//		
//Stampa la seconda riga di una matrice 3x3.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {4, 5, 6},
//				  {5, 6, 7}
//		};
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//				if( i == 1)
//				System.out.print(matrice[i][j]);
//			}
//		}
		
// Calcola la somma di ogni riga in una matrice 3x3.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {4, 5, 6},
//				  {5, 6, 7}
//		};
//		int r1 = 0;
//		
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//				r1 += matrice[i][j];
//			}
//			System.out.println("La somma della " + i + "riga è: " +r1);
//		}

		
// Calcola la somma di ogni colonna in una matrice 3x3.
//		int [][] matrice = {
//				  {1, 2, 3},
//				  {2, 4, 5},
//				  {5, 8, 10}
//		};
//		
//		for (int j = 0; j < matrice.length; j++) {
//			int somma = 0;
//			for (int i = 0; i < matrice[j].length; i++) {
//				somma += matrice[i][j];
//			}
//			System.out.println("la somma della colonna " + j +"e: "+ somma);
//		}
		
//Somma tutti gli elementi di una matrice 3x3.
//		int [][] matrice = {
//				{1,2,3},
//				{2,3,4},
//				{2,3,6}
//		};
//		int somma = 0;
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice.length; j++) {
//				somma += matrice[i][j];
//			}
//		}
//		System.out.println(somma);

//Trova il valore massimo in una matrice 3x2.
//		int [][] matrice = {
//				{1,2,3},
//				{2,3,4},
//				{2,3,6}
//		};
//		int max = matrice[0][0];
//		for (int i = 0; i < matrice.length; i++) {
//			for (int j = 0; j < matrice[i].length; j++) {
//				if (matrice[i][j] > max ) {
//					max = matrice[i][j];
//				}
//			}
//		}
//		System.out.println(max);

//Chiedi all'utente di inserire i valori di una matrice 2x2 e stampala.
//		Scanner scanner = new Scanner(System.in);
//		int [][] matrice = new int [2][2];
//		System.out.println("Inserisci valori matrice 2x2: ");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				matrice[i][j] = scanner.nextInt();
//			}
//		}
//       System.out.println("Matrice inserita: ");
//       for (int [] riga : matrice) {
//    	   for (int valore : riga) {
//    		   System.out.println(valore);
//    	   }
//       }
    	   
// Somma di tutti gli elementi di una matrice 3x3
//		Scanner scanner = new Scanner(System.in);
//		int[][] array = new int [3][3];
//		int somma = 0;
//		System.out.println("Inserisci i numeri:");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				array[i][j] = scanner.nextInt();
//				somma += array[i][j];
//			}
//		}
//		 System.out.println(somma);
		
//Somma degli elementi di ogni riga

//Somma di una colonna scelta
//		Scanner scanner = new Scanner(System.in);
//		int[][] array = new int [3][3];
//		int somma = 0;
//		System.out.print("Inserisci i numeri: ");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				array[i][j] = scanner.nextInt();
//				somma += array[i][2];
//			}
//		}
//		 System.out.println(somma); (?)
		
//Ricerca di un numero nella matrice 2x2
//Conta numeri pari e dispari
//Conta numeri > 10
//		Scanner scanner = new Scanner(System.in);
//		int[][] array = new int [2][2];
//		int count = 0;
//		System.out.println("Inserisci i numeri:");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				array[i][j] = scanner.nextInt();
//				if (array[i][j] >10) {
//					count++;
//				}
//			}
//		}
//		 System.out.println(count);
		

	}
}

