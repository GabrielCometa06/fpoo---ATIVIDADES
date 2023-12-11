package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Brinquedo {
	Scanner entrada = new Scanner(System.in);
	
//atributos

	public String nome;
	private int idade;
	private double altura;
	private double alturaMinima = 1.70;
	private int idadeMaxima = 15;
	
	
	//getters e setters
	public int getIdadeMaxima() {
		idadeMaxima = 14;
			System.out.println("diga sua idade!");
		idade = entrada.nextInt();
		if (idade >= idadeMaxima) {
			System.out.println("Pode entrar!");
		}if (idade < idadeMaxima) {
			System.out.println("nao pode entrar!");
		}
		return idadeMaxima;
	}
	public double getAlturaMinima() {
		alturaMinima = 1.70;
				System.out.println("diga sua altura!");
		altura = entrada.nextDouble();
			if (altura >= alturaMinima) {
				System.out.println("Pode entrar!");
			}if (altura < alturaMinima) {
				System.out.println("nao pode entrar!");
			}
	return alturaMinima;
	}
	
	public void getExibirInform() {
		
		System.out.println("Visitante: " + nome);
		System.out.println("Idade: " + idade + "anos");
		System.out.println("Altura: " + altura + "m");
		/*
		System.out.println("Seus dados");
		System.out.println("Nome: ");
		nome = entrada.next();
		System.out.println("Idade: ");
		idade = entrada.nextInt();
		System.out.println("Altura: ");
		altura = entrada.nextDouble();
		*/
	}

}
