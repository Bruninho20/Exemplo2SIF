import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  FilaSequencialInt filaAtendimento = new FilaSequencialInt();
	        filaAtendimento.init();
	        Scanner le = new Scanner(System.in);
	        int op;
	        do {
	            System.out.println("Digite \n\t1- Inserir aluno \n\t2- Atender aluno" + "\n\t3- Sair\n Opção: ");
	            op = le.nextInt();
	            switch (op) {
	            case 1:
	                System.out.print("Informe RM: ");
	                int rm = le.nextInt();
	                filaAtendimento.enqueue(rm);
	                break;
	            case 2: 
	                if(!filaAtendimento.isEmpty())
	                    System.out.println("Aluno chamado para atendimento: " + filaAtendimento.dequeue());
	                else                    System.out.println("Não há aluno para atender agora");
	                break;
	            case 3:
	                if (filaAtendimento.isEmpty())
	                    System.out.println(" Encerrando o atendimento de hoje");
	                else {
	                    op = 0;
	                    System.out.println("Ainda há aluno para ser atendido");
	                }
	                break;
	            default:
	                System.out.println("Opção inválida!");
	            }
	        } while (op != 3);
	    }
		
	}


