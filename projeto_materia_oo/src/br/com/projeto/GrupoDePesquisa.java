package br.com.projeto;

import java.util.List;

public class GrupoDePesquisa {
	
	private String nomeGrupo;
	private String temaDeTrabalho;
	public Funcionario profResponsavel;
	
	private List<Aluno> aluno;
	
	public void addAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		this.aluno.remove(aluno);
	}
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	public String getTemaDeTrabalho() {
		return temaDeTrabalho;
	}
	public void setTemaDeTrabalho(String temaDeTrabalho) {
		this.temaDeTrabalho = temaDeTrabalho;
	}
	public Funcionario getProfResponsavel() {
		return profResponsavel;
	}
	public void setProfResponsavel(Funcionario profResponsavel) {
		this.profResponsavel = profResponsavel;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	

}
