//Faça um programa que descubra:
//a) O maior elemento de um vetor
//b) O menor elemento de um vetor
//c) A média dos valores

//(Criar um método para cada questão)

package metodos;

public class Met5 {

	public static void main(String[] args) {

		int[] vetor = { 10, 5, 8, 15, 3 };

		int maior = encontrarMaior(vetor);
		int menor = encontrarMenor(vetor);
		double media = calcularMedia(vetor);

		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
		System.out.println("Média dos valores: " + media);
	}

	public static int encontrarMaior(int[] vetor) {
		int maior = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}

	public static int encontrarMenor(int[] vetor) {
		int menor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return menor;
	}

	public static double calcularMedia(int[] vetor) {
		int soma = 0;
		for (int valor : vetor) {
			soma += valor;
		}
		return (double) soma / vetor.length;
	}

}
