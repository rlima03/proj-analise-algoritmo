package uscs;

public class BuscaBinaria {
	public static int nComparacoes = 0;
	public static int indice;
	public static int[] A = {10,12,20,22,35,37,39,40,56,70,71,75};
	
	public static void main(String[] args) {
		int valor = 71;   //dado a ser pesquisado
		System.out.println("----- Busca Sequencial ou Linear -----");
		seqSearch(valor);
		if (indice != -1) {
			System.out.println("Valor encontrado na posição: " + indice);
			System.out.println("Total de Comparações: " + nComparacoes);
		}
		else {
			System.out.println("Valor não encontrado no Array!!!");
			System.out.println("Total de Comparações: " + nComparacoes);
		}
		
		nComparacoes = 0;
		
		System.out.println("\n\n ------ Busca Binária ----");
		binSearch(valor, 0, A.length-1);  
		
		if (indice != -1) {
			System.out.println("Valor encontrado na posição: " + indice);
			System.out.println("Total de Comparações: " + nComparacoes); 
		}
		else {
			System.out.println("Valor não encontrado no Array!!!");
			System.out.println("Total de Comparações: " + nComparacoes);
		}
		
	}
	
	//-------------- Busca Sequencial -----------------------------
	public static void seqSearch(int dado) {
		for (int i=0; i <A.length; i++) {
			if (A[i] == dado) {
				nComparacoes++;
				indice = i;
				break;
			}
		nComparacoes++;
		indice = -1;
	  }
	}
	//------------ Busca Binária --------------
	public static void binSearch(int item, int begin, int end) {
		int metade = (begin+end)/2;
		
		if(begin > end ) {//ponto de parada => caso base
			indice = -1;
			nComparacoes++;
			return;		
		}
		if (A[metade] == item ) {
			indice = metade;
			nComparacoes++;
			return;
		}
		if (A[metade] < item ) {
			nComparacoes++;
			binSearch(item, metade+1, end);
		}
		else {
			nComparacoes++;
			binSearch(item, begin, metade);
		}
	}
}
