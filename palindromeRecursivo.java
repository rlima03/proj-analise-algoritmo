package uscs;

import java.util.Scanner;

public class PalindromeRecursiva {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Entre com um texto qualquer: ");

		String texto = in.nextLine();
		System.out.println("Texto entrado: " + texto);

		if ( checaPalindromeRecursiva(texto) )  
			System.out.println("Sim, o texto entrado é palíndrome... ");
		else
			System.out.println("Não, o texto entrado NÃO é palíndrome... ");

		in.close();

	}

	public static boolean checaPalindromeRecursiva(String texto) {

		if (texto.length() <= 1) 
			return true; 
		else   
			if (texto.charAt(0) != texto.charAt((texto.length() - 1)) )  
				return false; 
			else  
				return checaPalindromeRecursiva( texto.substring(1,texto.length()-1) ) ; 

	}

}
