package metodos;

import java.util.Scanner;

public class Met2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome de um colega: (Use colega1, colega2 ou colega3)");
		String nomeColega = entrada.nextLine();

		switch (nomeColega) {
		case "colega1":
			imprimirInformacoesColega1();
			break;
		case "colega2":
			imprimirInformacoesColega2();
			break;
		case "colega3":
			imprimirInformacoesColega3();
			break;
		default:
			System.out.println("Nome de colega não reconhecido.");
		}
	}

	public static void imprimirInformacoesColega1() {
		System.out.println("Ana");
		System.out.println("Ela tem 25 anos");
		System.out.println("Ela é estudante do Entra 21");
	}

	public static void imprimirInformacoesColega2() {
		System.out.println("Lucas");
		System.out.println("Ele tem 22 anos");
		System.out.println("Ele é estudante do Entra 21");
	}

	public static void imprimirInformacoesColega3() {
		System.out.println("João");
		System.out.println("Ele tem 28 anos");
		System.out.println("Ele é estudante do Entra 21");
	}

}
