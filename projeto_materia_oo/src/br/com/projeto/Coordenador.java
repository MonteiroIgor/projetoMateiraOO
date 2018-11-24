package br.com.projeto;

import java.util.List;


public class Coordenador {
	
	private String nome;
	private String matrFunc;
	private String senha;
	private String email;
	
	private List<Funcionario> funcionario;
	private List<Projeto> projeto;
	private List<Curso> curso;
	private List<GrupoDePesquisa> grupoDePesquisa;
	
	
	//Métodos para LIST Funcionário
	public void addFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		this.funcionario.remove(funcionario);
	}
	
	public void listarFuncionario(List<Funcionario> funcionario) {
		for (Funcionario funcionarios : funcionario) {
			System.out.println(">>>>>>>>>" + funcionarios.getNome());
			System.out.println(">>>>>>>>>" + funcionarios.getCargo());
			System.out.println(">>>>>>>>>" + funcionarios.getMatrFunc());
		}
	}
	
	
	
	//Métodos para LIST Projeto
	public void addProjeto(Projeto projeto) {
		this.projeto.add(projeto);
	}
	public void removerProjeto(Projeto projeto) {
		this.projeto.remove(projeto);
	}
	
	public void listarProjeto(List<Projeto> projeto) {
		for (Projeto projetos : projeto) {
			System.out.println(">>>>>>>>>" + projetos.getTema());
			System.out.println(">>>>>>>>>" + projetos.getDisciplina());
			System.out.println(">>>>>>>>>" + projetos.getIntegrantes());
		}
	}
	
	
	
	
	//Métodos para LIST Curso
	public void addCurso(Curso curso) {
		this.curso.add(curso);
	}
	public void removerCurso(Curso curso) {
		this.curso.remove(curso);
	}
	
	public void listarCurso(List<Curso> curso) {
		for (Curso cursos : curso) {
			System.out.println(">>>>>>>>>" + cursos.getNome());
			System.out.println(">>>>>>>>>" + cursos.getCoordenador());
			System.out.println(">>>>>>>>>" + cursos.getQntPeriodos());
		}
	}
	
	
	
	//Métodos para LIST Grupo de Pesquisa
	public void addGrupoDePesquisa(GrupoDePesquisa grupoDePesquisa) {
		this.grupoDePesquisa.add(grupoDePesquisa);
	}
	public void removerGrupoDePesquisa(GrupoDePesquisa grupoDepesquisa) {
		this.grupoDePesquisa.remove(grupoDePesquisa);
	}
	public void listarGrupoDePesquisa(List<GrupoDePesquisa> grupoDePesquisa) {
		for (GrupoDePesquisa gruposDePesquisa : grupoDePesquisa) {
			System.out.println(">>>>>>>>>" + gruposDePesquisa.getNomeGrupo());
			System.out.println(">>>>>>>>>" + gruposDePesquisa.getTemaDeTrabalho());
			System.out.println(">>>>>>>>>" + gruposDePesquisa.getAluno());
			System.out.println(">>>>>>>>>" + gruposDePesquisa.getProfResponsavel());
		}
	}
	
	
	//Geters and Setters
	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	public List<Funcionario> getProfessor() {
		return funcionario;
	}

	public void setProfessor(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
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

	public List<GrupoDePesquisa> getGrupoDePesquisa() {
		return grupoDePesquisa;
	}

	public void setGrupoDePesquisa(List<GrupoDePesquisa> grupoDePesquisa) {
		this.grupoDePesquisa = grupoDePesquisa;
	}
	
	
	
	
}
