package br.fiap.aluno;

public class AlunoFundamental extends Aluno {

	// atributo espec�fico da classe

	private int serie;

	public double calcularMedia() {
		return (prova1 + prova2) / 2;
	}

}
