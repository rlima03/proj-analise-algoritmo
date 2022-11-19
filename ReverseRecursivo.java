package uscs;

import java.util.Arrays;

public class ReverseRecursivo {
	public static int contador = 0;

	public static void main(String[] args) {

		Integer[] lista = new Integer[10]; 

		for (int i = 0 ; i <lista.length; i++) 
			lista[i] = geraRandom();

		System.out.println("---- Início do Programa ---");
		System.out.println("Lista........:  " + Arrays.toString(lista)); 

		lista = reverseRecursivo(lista, 0 , lista.length-1);

		System.out.println("Lista reversa:  " + Arrays.toString(lista));
		System.out.println("---- Fim do Programa -----");

	}

	public static int geraRandom( ) { 

		return (int) (1000.0 * (Math.random()));

	}

	public static Integer[]  reverseRecursivo (Integer[] lista, int i, int j )  { 

		if (i<j) { 
			int trab = lista[i]; 
			lista[i] = lista[j]; 
			lista[j] = trab;  
			reverseRecursivo(lista, i+1, j-1); 
		}
		return lista;
	}
}
