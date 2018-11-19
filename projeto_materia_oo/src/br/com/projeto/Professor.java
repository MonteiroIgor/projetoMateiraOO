package br.com.projeto;

import java.util.List;

public class Professor {
	
	private String nome;
	private String matrFunc;
	private String senha;
	private String disciplina;
	private String email;
	
	private List<Aluno> aluno;
	private List<Projeto> projeto;
	private List<Curso> curso;
	
	
	
	public void addAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}
	public void removerAluno(Aluno aluno) {
		this.aluno.remove(aluno);
	}
	
	
	public void addProjeto(Projeto projeto) {
		this.projeto.add(projeto);
	}
	public void removerProjeto(Projeto projeto) {
		this.projeto.remove(projeto);
	}
	
	
	public void addCurso(Curso curso) {
		this.curso.add(curso);
	}
	public void removerCurso(Curso curso) {
		this.curso.remove(curso);
	}
	
	
	
	
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	public List<Projeto> getProjeto() {
		return projeto;
	}
	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatrFunc() {
		return matrFunc;
	}
	public void setMatrFunc(String matrFunc) {
		this.matrFunc = matrFunc;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
