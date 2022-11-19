package uscs;
import java.util.Arrays;

public class BubbleSort {

	public static int contador = 0;

	public static void main (String [] args ) { 
		
		int[] lista1 = new int[10];
		lista1[0]=10;
		for(int i=1;i<lista1.length;i++)
			lista1[i]=lista1[i-1]-1;

		lista1 = bubble(lista1); 

		System.out.println("*********************************************************");
		System.out.println("Total de operações para um array com 10 posições:  " + contador);
		System.out.println (Arrays.toString(lista1) ) ; 
		
	
	
	}
	public static int[] bubble(int[] lista) { 

		int aux; 
		int n = lista.length; 

		for (int i = 1; i < n ; i++ ) 
			for (int j = 1; j < n ; j ++) {
				if (lista[j-1]  > lista[j] )  { 
					contador++;
					aux = lista[j-1]; 
					lista[j-1] = lista[j]; 
					lista[j] = aux; 
				}
			}
		return lista; 
	}
}
