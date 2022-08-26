package controller;

public class Operacoes {
	
	public Operacoes() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);
			intercl(vetor, inicio, meio, fim);
		}
		
		return vetor;
	}
		
		private void intercl (int[] vetor, int inicio, int meio, int fim) {
			int[] vetAux = new int [vetor.length];
			for (int i = inicio; i <= fim; i++) {
				vetAux[i] = vetor[i];
			}
			
		int pontEsquerda = inicio;
		int pontDireita = meio + 1;
		
		for (int cont = inicio; cont <= fim; cont++) {
			if (pontEsquerda > meio) {
				vetor[cont] = vetAux[pontEsquerda];
				pontDireita++;
			}
			else if (pontDireita > fim) {
				vetor[cont] = vetAux[pontEsquerda];
				pontEsquerda++;
			}
			else if (vetAux[pontEsquerda] < vetAux[pontDireita]) {
				vetor[cont] = vetAux[pontEsquerda];
				pontEsquerda++;
			}
			else {
				vetor[cont] = vetAux[pontDireita];
				pontDireita++;
			}
		}
		}
	}
