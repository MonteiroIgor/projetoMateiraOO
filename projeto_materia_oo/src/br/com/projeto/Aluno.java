package br.com.projeto;

public class Aluno {
	
	private String nome;
	private String matrAluno;
	private String senha;
	private Curso curso;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatrAluno() {
		return matrAluno;
	}
	public void setMatrAluno(String matrAluno) {
		this.matrAluno = matrAluno;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

}
