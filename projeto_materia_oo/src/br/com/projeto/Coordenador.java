package br.com.projeto;

import java.util.List;

public class Coordenador {
	
	private String nome;
	private String matrFunc;
	private String senha;
	private String email;
	
	private List<Professor> professor;
	private List<Projeto> projeto;
	private List<Curso> curso;
	
	
	public void addProfessor(Professor professor) {
		this.professor.add(professor);
	}
	
	public void removerProfessor(Professor professor) {
		this.professor.remove(professor);
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
	
	
	
	
	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	public List<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}

	public List<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
