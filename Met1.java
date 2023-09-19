package metodos;

import java.util.Scanner;

public class Met1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 4 para selecionar a estação do ano:");
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
			System.out.println("Número inválido. Por favor, escolha um número de 1 a 4.");
		}
	}

	public static void imprimirVerao() {
		System.out.println("É verão");
		System.out.println("E o tempo está quente");
	}

	public static void imprimirOutono() {
		System.out.println("É outono");
		System.out.println("E o tempo está agradável");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno");
		System.out.println("E está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera");
		System.out.println("E as flores estão desabrochando");
	}
}