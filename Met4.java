//Fa�a um programa que inverta os valores de duas vari�veis

//Por exemplo:

//int a = 5;
//int b = 2;

//Dever� ser:
//a == 2;
//b == 5;

//� permitido criar somente uma vari�vel dentro do m�todo
//(Fazer esse m�todo funcionar para qualquer valor inserido, al�m de qualquer tipo de vari�vel inserido).

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

		System.out.println("Antes da invers�o:");
		System.out.println("a = " + valorA);
		System.out.println("b = " + valorB);

		inverterVariaveis(valorA, valorB);

		System.out.println("Ap�s a invers�o:");
		System.out.println("a = " + valorB);
		System.out.println("b = " + valorA);
	}

	public static void inverterVariaveis(int valorB, int valorA) {
		valorA = valorB;
		valorB = valorA;

	}
}
