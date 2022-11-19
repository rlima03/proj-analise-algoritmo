package uscs;

import java.util.Arrays;

public class MaxRecursivo {

	public static void main(String[] args) {
		 
		int[] lista = new int[10]; 
			
		for (int i = 0 ; i <lista.length; i++) 
			lista[i] = geraRandom();
				
		int max = maxRecursivo(lista, lista.length);
		
		System.out.println("---- Início do Programa ---");
		System.out.println("Lista: " + Arrays.toString(lista)); 
		System.out.println("Maior elemento: " + max);
		System.out.println("---- Fim do Programa -----");
		
	}
	
	public static int geraRandom( ) { 
		
		return (int) (1000.0 * (Math.random()));
		
	}
	
	public static int maxRecursivo(int[] lista, int n ) {
		
		if (n == 1) 
			return lista[0]; 

		else { 
			
			int maximo = maxRecursivo(lista,n-1); 

			if (maximo < lista[n-1])
				return lista[n-1]; 
			else 
				return maximo; 
		} 

	}

}
