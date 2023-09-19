//Faça um código que some duas arrays e imprima tanto as duas arrays originais como a somada

package metodos;

public class Met10 {

	public static void main(String[] args) {

		int[] vetor1 = { 1, 2, 3, 4, 5 };
		int[] vetor2 = { 6, 7, 8, 9, 10 };

		int[] soma = somarVetores(vetor1, vetor2);

		System.out.println("Array 1: " + imprimeVetor(vetor1));
		System.out.println("Array 2: " + imprimeVetor(vetor2));
		System.out.println("Soma: " + imprimeVetor(soma));
	}

	public static int[] somarVetores(int[] vet1, int[] vet2) {
		if (vet1.length != vet2.length) {
			System.err.println("Erro: Os vetores devem ter o mesmo tamanho.");
			return null;
		}

		int[] resultado = new int[vet1.length];

		for (int i = 0; i < vet1.length; i++) {
			resultado[i] = vet1[i] + vet2[i];
		}

		return resultado;
	}

	public static String imprimeVetor(int[] vetor) {
		String resultado = "[";
		for (int i = 0; i < vetor.length; i++) {
			resultado += vetor[i];
			if (i < vetor.length - 1) {
				resultado += ", ";
			}
		}
		resultado += "]";
		return resultado;
	}

}
