package br.org.sesisp.view;
	
	import br.org.sesisp.dao.CruDAO;
	import br.org.sesisp.model.Aluno;
	import java.util.Scanner;

import javax.swing.JOptionPane;
	public class TelaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// intanciar um objeto da classe CruDAO
		CruDAO inserir_aluno = new CruDAO();
		//instanciar um objeto aluno
		Aluno aluno1 = new Aluno();
		
		int i;
		do {
			System.out.println("Escolha uma opcao!");
			System.out.println("1. Criar ");
			System.out.println("2. Atualizar ");
			System.out.println("3. Ler ");
			System.out.println("4. Excluir ");
			i = entrada.nextInt();
		
		switch(i) {	

		
		case 1:
		aluno1.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno: ")));
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		break;
		
		//************************************************
		//Atualizar valores
		
		case 2:
		aluno1.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno: ")));
		inserir_aluno.update(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		break;
		//************************************************
		//ler tabela alunos do BD
		
		case 3:
		System.out.println("lendo a lista...");
			for (Aluno olho : inserir_aluno.read()) {
				System.out.println("Dados do aluno: " + olho.getRa() + olho.getNome() + aluno1.getIdade());
			break;
		}
		//************************************************
		//excluir dados

		case 4:
		CruDAO remover_aluno = new CruDAO();
		System.out.println("Digite o que deseja excluir! ");
		remover_aluno.delete(entrada.nextInt());
		break;
		}
		} while (i!= 0);
	}

}