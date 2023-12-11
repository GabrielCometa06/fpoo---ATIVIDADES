package Atividade_Gabriel_Cometa;

import java.util.Scanner;
public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Banda b1 = new Banda();
		Vocalista v1 = new Vocalista();
		Baixista bx1 = new Baixista();
		Baterista bt1 = new Baterista();
		Guitarrista g1 = new Guitarrista();
		
		System.out.println("---PRIMEIRA BANDA---");
		System.out.println(" Digite o nome da banda: ");
		b1.setNome(entrada.next());
		System.out.println(" Digite o nome do vocalista: ");
		v1.setNome(entrada.next());
		System.out.println(" Digite o nome do Baixista: ");
		bx1.setNome(entrada.next());
		System.out.println(" Digite o nome do Baterista: ");
		bt1.setNome(entrada.next());
		
		b1.exibirMembros();
		b1.produzirShow();
		
		System.out.println("---SEGUNDA BANDA---");
		System.out.println(" Digite o nome da banda: ");
		b1.setNome(entrada.next());
		System.out.println(" Digite o nome do vocalista: ");
		v1.setNome(entrada.next());
		System.out.println(" Digite o nome do Baixista: ");
		bx1.setNome(entrada.next());
		System.out.println(" Digite o nome do Baterista: ");
		bt1.setNome(entrada.next());
		System.out.println(" Digite o nome do Guitarrista: ");
		g1.setNome(entrada.next());
		
		b1.exibirMembros();
		b1.produzirShow();
	}

}
