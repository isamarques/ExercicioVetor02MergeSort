package view;
import controller.Operacoes;

public class Principal {
	
	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		Operacoes operacoes = new Operacoes();
		vetor = operacoes.mergeSort(vetor, 0, vetor.length - 1);
		
		for (int num : vetor) {
			System.out.print(num);
			System.out.print(" ");
		}
	}
}
