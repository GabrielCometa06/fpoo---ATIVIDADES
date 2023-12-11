package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class TesteCasa {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Casa c1 = new Casa();
		Quarto q1 = new Quarto();
		Sala s1 = new Sala();

		System.out.println("----CASA 1----");
		System.out.println("Cor da casa:");
		c1.setCor(entrada.next());
		System.out.println("Preco da casa:");
		c1.setPreco(entrada.nextFloat());
		System.out.println("Metragem:");
		c1.setMetragem(entrada.nextFloat());
		System.out.println("Quantidade de quartos:");
		c1.setQtdQuarto(entrada.nextInt());
		System.out.println("Quantidade de salas:");
		c1.setQtdSala(entrada.nextInt());

		Casa c2 = new Casa();
		Quarto q2 = new Quarto();
		Sala s2 = new Sala();

		

		System.out.println("----CASA 2----");
		System.out.println("Cor da casa:");
		c2.setCor(entrada.next());
		System.out.println("Preco da casa:");
		c2.setPreco(entrada.nextFloat());
		System.out.println("Metragem:");
		c2.setMetragem(entrada.nextFloat());
		System.out.println("Quantidade de quartos:");
		c2.setQtdQuarto(entrada.nextInt());
		System.out.println("Quantidade de salas:");
		c2.setQtdSala(entrada.nextInt());

		c1.mostrarDetalhes();
		c2.mostrarDetalhes();
	}
}
