package br.com.projetoPrincipal;

import br.com.projeto.Aluno;
import java.util.Scanner;

public class Gerenciamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
	

		System.out.println("Digite seu Nome: ");
		a1.setCurso(scan.nextLine());
		
		System.out.println(a1.getCurso());

	}

}
