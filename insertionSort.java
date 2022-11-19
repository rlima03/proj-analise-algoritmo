package uscs;

import java.util.Arrays;

public class InsertionSort {
	public static int contador=0;

	public static void main (String[] args ) { 

		int[] lista1 = new int[10];
		lista1[0]=10;
		for(int i=1;i<lista1.length;i++)
			lista1[i]=lista1[i-1]-1;

		lista1 = sortInsertion(lista1); 

		System.out.println("*********************************************************");
		System.out.println("Total de operações p/array com 10 posições:  " + contador);
		System.out.println (Arrays.toString(lista1) ) ; 
	

	}
	public static int[] sortInsertion(int[] lista)   { 

		int i, j, aux; 

		for (i = 1; i < lista.length; i++)  { 

			aux = lista[i]; 

			j = i; 

			while (j > 0 && lista[j-1] > aux) { 
				contador++;

				lista[j] = lista[j-1]; 

				j--; 
			}

			lista[j] = aux; 
		}

		return lista; 
	}


}
