package listas;

public class Aluno {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Método para imprimir o nome dos alunos na tela
	public String toString() {
		return this.nome;
	}
	
	//Método para comparar dois objetos do tipo aluno, onde o critério de compração será o nome
	public boolean equals(Object o) {
		Aluno outro = (Aluno)o;
		return this.nome.equals(outro.nome);
	}
}
