package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// instancia de objetos
		Pao p1 = new Pao();
		Pao p2 = new Pao();
		Bolo b1 = new Bolo();
		Bolo b2 = new Bolo();
		Doce d1 = new Doce();
		Doce d2 = new Doce();
		
		/*
		p1.setNome(entrada.nextLine());
		p1.setPreco(entrada.nextDouble());
		p2.setNome(entrada.nextLine());
		p2.setPreco(entrada.nextDouble());
		b1.setNome(entrada.nextLine());
		b1.setPreco(entrada.nextDouble());
		b2.setNome(entrada.nextLine());
		b2.setPreco(entrada.nextDouble());
		d1.setNome(entrada.nextLine());
		d1.setPreco(entrada.nextDouble());
		d2.setNome(entrada.nextLine());
		d2.setPreco(entrada.nextDouble());
		*/
		
		System.out.println("----PAO1----");
		System.out.println(" Salgado1: ");
		p1.setNome(entrada.next());
		System.out.println(" Digite o preço do Salgado1: ");
		p1.setPreco(entrada.nextDouble());
		
		System.out.println("----PAO2----");
		System.out.println(" Salgado2: ");
		p2.setNome(entrada.next());
		System.out.println(" Digite o preço do Salgado2: ");
		p2.setPreco(entrada.nextDouble());
		
		System.out.println("----BOLO1----");
		System.out.println(" Bolo1: ");
		b1.setNome(entrada.next());
		System.out.println(" Digite o preço do Bolo1: ");
		b1.setPreco(entrada.nextDouble());
		
		
		System.out.println("----BOLO2----");
		System.out.println(" Bolo2: ");
		b2.setNome(entrada.next());
		System.out.println(" Digite o preço do Bolo2: ");
		b2.setPreco(entrada.nextDouble());
		
		System.out.println("----DOCE1----");
		System.out.println(" Doce1: ");
		d1.setNome(entrada.next());
		System.out.println(" Digite o preço do Doce1: ");
		d1.setPreco(entrada.nextDouble());
		
		System.out.println("----Doce2----");
		System.out.println(" Doce2: ");
		d2.setNome(entrada.next());
		System.out.println(" Digite o preço do Doce2: ");
		d2.setPreco(entrada.nextDouble());
		
		ComerProduto pes1 = new ComerProduto();
		
		pes1.setNome("Robsu");
		
		System.out.println(pes1.getNomePes() + " fazendo: " + p1.getNome() + " custando: " + p1.getPreco() + " está comendo também: " + b1.getNome() + "custando: " + b1.getPreco() + " e finalizando com: " + d1.getNome()  +" custando: " + d1.getPreco() + " Juto com: " + d2.getNome() + " custando: " + d2.getPreco());
	}

}
