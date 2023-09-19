package metodos;

import java.util.Scanner;

public class Met1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 4 para selecionar a esta��o do ano:");
		int numeroEstacao = scanner.nextInt();

		switch (numeroEstacao) {
		case 1:
			imprimirVerao();
			break;
		case 2:
			imprimirOutono();
			break;
		case 3:
			imprimirInverno();
			break;
		case 4:
			imprimirPrimavera();
			break;
		default:
			System.out.println("N�mero inv�lido. Por favor, escolha um n�mero de 1 a 4.");
		}
	}

	public static void imprimirVerao() {
		System.out.println("� ver�o");
		System.out.println("E o tempo est� quente");
	}

	public static void imprimirOutono() {
		System.out.println("� outono");
		System.out.println("E o tempo est� agrad�vel");
	}

	public static void imprimirInverno() {
		System.out.println("� inverno");
		System.out.println("E est� frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("� primavera");
		System.out.println("E as flores est�o desabrochando");
	}
}