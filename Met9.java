//Fa�a um c�digo que receba duas entradas do usu�rio

//Imprima essas duas entradas ao cubo se:
//Algum dos dois n�meros for 5
//A soma deles � 5
//A diferen�a deles � 5

//Se nenhuma dessas condi��es forem satisfeitas, imprima o quadrado dos n�meros.
package metodos;

import java.util.Scanner;

public class Met9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		int numero2 = scanner.nextInt();

		calcularEImprimirResultado(numero1, numero2);

		scanner.close();
	}

	public static void calcularEImprimirResultado(int num1, int num2) {
		int resultado1;
		int resultado2;

		if (num1 == 5 || num2 == 5 || num1 + num2 == 5 || num2 + num1 == 5 || (num1 - num2) == 5) {
			resultado1 = num1 * num1 * num1;
			resultado2 = num2 * num2 * num2;

			System.out.println("Resultado 1 ao cubo: " + resultado1);
			System.out.println("Resultado 2 ao cubo: " + resultado2);

		} else if (num1 != 5 || num2 != 5 || num1 + num2 != 5 || num2 + num1 != 5 || (num1 - num2) != 5) {
			System.out.println("Resultado 1 ao quadrado: " + num1 * num1);
			System.out.println("Resultado 2 ao quadrado: " + num2 * num2);

		}
	}
}
