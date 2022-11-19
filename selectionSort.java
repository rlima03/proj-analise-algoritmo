package uscs;

import java.util.Arrays;

public class SelectionSort {
	public static int contador = 0;
	
	public static void main(String[] args) { 
		int[] lista1 = new int[100];
		lista1[0]=100;
		for(int i=1;i<lista1.length;i++)
			lista1[i]=lista1[i-1]-1;

		lista1 = selection_sort(lista1); 

		System.out.println("*********************************************************");
		System.out.println("Total de operações p/array com 100 posições:  " + contador);
		System.out.println (Arrays.toString(lista1) ) ; 
		
	}
    public static int[] selection_sort(int[] lista) { 

	int menor, indiceMenor;  

	for (int i = 0 ;  i < lista.length - 1 ; i++) { 

		menor = lista[i]; 
		indiceMenor = i ; 

		for (int j = i+1 ;  j < lista.length ; j++) { 

			if (lista[j] < menor) { 
				contador++;
				menor = lista[j]; 
				indiceMenor = j; 
			} 
		}
		lista[indiceMenor] = lista[i]; 

		lista[i]=menor; 
	} 
	return lista; 
    }
} 
