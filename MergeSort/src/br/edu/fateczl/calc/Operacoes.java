package br.edu.fateczl.calc;

public class Operacoes {

	public Operacoes() {
		super();
	}

	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		System.out.println("Vetor da posição " + inicio + " até " + fim);
		
		if (inicio < fim) {
			int meio = (inicio + fim) /2;
			mergeSort(vetor, inicio, meio); //Esquerda;
			mergeSort(vetor, meio + 1, fim); //Direita;
			intercala(vetor, inicio, meio, fim);
		}
		
		return vetor;
	}
	
	private void intercala(int [] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[vetor.length];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		
		int esq = inicio;
		int dir = meio + 1;
		
		for (int contador = inicio; contador <= fim; contador++) {
			if (esq > meio) {
				vetor[contador] = novoVetor[dir];
				dir++;
			} else if (dir > fim) {
				vetor[contador] = novoVetor[esq];
				esq++;
			} else  if (novoVetor[esq] < novoVetor[dir]) {
				vetor[contador] = novoVetor[esq];
				esq++;
			} else {
				vetor[contador] = novoVetor[dir];
				dir++;	
			}
		}
	}
}
