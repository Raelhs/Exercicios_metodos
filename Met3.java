//Faça um programa que exiba o número que o usuário entrou e os 20 números que vem depois dele
//(O parâmetro do método deve ser o número inserido pelo usuário)

package metodos;

import java.util.Scanner;

public class Met3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();

		exibirNumerosSequenciais(numero);

		entrada.close();
	}

	public static void exibirNumerosSequenciais(int numero) {
		System.out.println("Número inserido: " + numero);

		for (int i = numero + 1; i <= numero + 20; i++) {
			System.out.println(i);
		}
	}
}