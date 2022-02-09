import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetor = new int[5];
		int maiorValor = 0;
		int menorValor = 1;

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o valor:");
			vetor[i] = entrada.nextInt();

			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		for (int i = 0; i < 5; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}
		System.out.println("Maior = " + maiorValor);
		System.out.println("Menor = " + menorValor);

		entrada.close();
	}
}
