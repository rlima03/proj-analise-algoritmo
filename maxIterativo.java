package uscs;

import java.util.Arrays;

public class MaxIterativo {

	public static void main(String[] args) {
		 
		int[] lista = new int[10]; 
			
		for (int i = 0 ; i <lista.length; i++) 
			lista[i] = geraRandom();
				
		int max = maxIterativo(lista);
		
		System.out.println("---- Início do Programa ---");
		System.out.println("Lista: " + Arrays.toString(lista)); 
		System.out.println("Maior elemento: " + max);
		System.out.println("---- Fim do Programa -----");
		
	}
	
	public static int geraRandom( ) { 
		
		return (int) (1000.0 * (Math.random()));
		
	}
	
	public static int maxIterativo(int[] lista) {
		
		int maximo = lista[0]; 
		
		for (int i = 1 ; i < lista.length; i++)  
			if (lista[i] > maximo)
				maximo = lista[i];
		 
		return maximo;
	}

}
