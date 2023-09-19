//Faça um programa que receba um número, esse será o número "base"
//Depois faça o usuário entrar com mais dois números
//Imprima qual dos dois últimos números está mais perto do primeiro número "base"

package metodos;

import java.util.Scanner;

public class Met7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número base: ");
		double numeroBase = scanner.nextDouble();

		System.out.print("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();

		String maisProximo = determinarMaisProximo(numeroBase, numero1, numero2);

		System.out.println(maisProximo);

		scanner.close();
	}

	public static String determinarMaisProximo(double base, double numero1, double numero2) {
		double diferenca1 = (base - numero1);
		double diferenca2 = (base - numero2);

		if (diferenca1 < diferenca2) {
			return "O primeiro número está mais próximo do número base.";
		} else if (diferenca2 < diferenca1) {
			return "O segundo número está mais próximo do número base.";
		} else {
			return "Os dois números estão igualmente próximos do número base.";
		}

	}

}
