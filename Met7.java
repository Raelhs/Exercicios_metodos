//Fa�a um programa que receba um n�mero, esse ser� o n�mero "base"
//Depois fa�a o usu�rio entrar com mais dois n�meros
//Imprima qual dos dois �ltimos n�meros est� mais perto do primeiro n�mero "base"

package metodos;

import java.util.Scanner;

public class Met7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o n�mero base: ");
		double numeroBase = scanner.nextDouble();

		System.out.print("Digite o primeiro n�mero: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		double numero2 = scanner.nextDouble();

		String maisProximo = determinarMaisProximo(numeroBase, numero1, numero2);

		System.out.println(maisProximo);

		scanner.close();
	}

	public static String determinarMaisProximo(double base, double numero1, double numero2) {
		double diferenca1 = (base - numero1);
		double diferenca2 = (base - numero2);

		if (diferenca1 < diferenca2) {
			return "O primeiro n�mero est� mais pr�ximo do n�mero base.";
		} else if (diferenca2 < diferenca1) {
			return "O segundo n�mero est� mais pr�ximo do n�mero base.";
		} else {
			return "Os dois n�meros est�o igualmente pr�ximos do n�mero base.";
		}

	}

}
