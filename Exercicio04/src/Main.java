import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FilaSequencial f = new FilaSequencial();
		f.init();
		Scanner entrada = new Scanner(System.in);
		int opc;

		do {
			System.out.println("1 - Submeter 1 processo");
			System.out.println("2 - Executar 2 processo");
			System.out.println("3 - shutdown");
			opc = entrada.nextInt();

			switch (opc) {
			case 1:
				System.out.println("informe o pid");
				int pid = entrada.nextInt();
				f.enqueue(pid);
				break;
			case 2:
				if (!f.isEmpty()) {
					pid = f.dequeue();
					System.out.println("Processo " + pid + " Esta sendo executado");
					System.out.println("Processo ja foi concluído? (1-sim/2-não)");
					int resp = entrada.nextInt();
					if (resp == 2) {
						f.enqueue(pid);
					} else {
						System.out.println("Processo concluído");
					}
				}
				break;
			case 3:
				if (!f.isEmpty()) {
					System.out.println("Há processos de fila na execução. ");
					System.out.println("Deseja encerrar? (1-Sim/2-Não)");
					int resp = entrada.nextInt();
					if (resp == 2) {
						while (!f.isEmpty())
							System.out.println("Encerrando o processo " + f.dequeue());
						System.out.println("ShutDown...");
					} else {
						opc = 0;
					}

				} else
					System.out.println("Opção inválida");
				break;
			default:
				System.out.println("Opção inválida");
			}

		} while (opc != 3);
		entrada.close();
	}
}
