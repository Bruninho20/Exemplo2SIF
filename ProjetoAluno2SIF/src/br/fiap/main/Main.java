package br.fiap.main;

import br.fiap.aluno.Aluno;
import br.fiap.aluno.AlunoFundamental;
import br.fiap.aluno.AlunoGraduacao;
import br.fiap.aluno.AlunoPosGraudacao;


public class Main {

	public static void main(String[] args) {
		
		 Aluno [] aluno = new Aluno[3];
		 aluno[0]= new AlunoFundamental();
		 aluno[1]= new AlunoGraduacao();
		 aluno[2]= new AlunoPosGraudacao();
		 

		 

	}

}
