//Faça um programa que inverta os valores de duas variáveis

//Por exemplo:

//int a = 5;
//int b = 2;

//Deverá ser:
//a == 2;
//b == 5;

//É permitido criar somente uma variável dentro do método
//(Fazer esse método funcionar para qualquer valor inserido, além de qualquer tipo de variável inserido).

package metodos;

import java.util.Scanner;

public class Met4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro valor: ");
		int valorA = entrada.nextInt();
		System.out.println("Insira o segundo valor: ");
		int valorB = entrada.nextInt();

		System.out.println("Antes da inversão:");
		System.out.println("a = " + valorA);
		System.out.println("b = " + valorB);

		inverterVariaveis(valorA, valorB);

		System.out.println("Após a inversão:");
		System.out.println("a = " + valorB);
		System.out.println("b = " + valorA);
	}

	public static void inverterVariaveis(int valorB, int valorA) {
		valorA = valorB;
		valorB = valorA;

	}
}
