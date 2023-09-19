//Fa�a um programa que exiba o n�mero que o usu�rio entrou e os 20 n�meros que vem depois dele
//(O par�metro do m�todo deve ser o n�mero inserido pelo usu�rio)

package metodos;

import java.util.Scanner;

public class Met3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int numero = entrada.nextInt();

		exibirNumerosSequenciais(numero);

		entrada.close();
	}

	public static void exibirNumerosSequenciais(int numero) {
		System.out.println("N�mero inserido: " + numero);

		for (int i = numero + 1; i <= numero + 20; i++) {
			System.out.println(i);
		}
	}
}