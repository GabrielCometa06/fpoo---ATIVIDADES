package Atividade_Gabriel_Cometa;

import java.util.Scanner;
public class TesteCao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Cachorro c3 = new Cachorro();
		
		c3.setNome("Ruby");
		c2.setNome("Marcio");
		c1.setNome("Joao");
		
		System.out.println("C1");
		System.out.println("Nome: ");
		c1.setNome(entrada.next());
		System.out.println("Sexo: ");
		c1.setSexo(entrada.next());
		System.out.println("Peso: ");
		c1.setPeso(entrada.nextFloat());
		System.out.println("Quantidade de patas: ");
		c1.setQtdPatas(entrada.nextInt());
		
		System.out.println("C2");
		System.out.println("Nome: ");
		c2.setNome(entrada.next());
		System.out.println("Sexo: ");
		c2.setSexo(entrada.next());
		System.out.println("Peso: ");
		c2.setPeso(entrada.nextFloat());
		System.out.println("Quantidade de patas: ");
		c2.setQtdPatas(entrada.nextInt());
		
		System.out.println("C3");
		System.out.println("Nome: ");
		c3.setNome(entrada.next());
		System.out.println("Sexo: ");
		c3.setSexo(entrada.next());
		System.out.println("Peso: ");
		c3.setPeso(entrada.nextFloat());
		System.out.println("Quantidade de patas: ");
		c3.setQtdPatas(entrada.nextInt());
		
		System.out.println(c1 + " O cachorro quis " + 
		c1.getLatir() + " o cachorro quer " + 
		c1.getCorrer() + " depois ele vai " + 
		c1.getDormir() + " Para depois " + 
		c1.getBrincar());
		
		System.out.println(c2 + " O cachorro quis " + 
				c2.getLatir() + " o cachorro quer " + 
				c2.getCorrer() + " depois ele vai " + 
				c2.getDormir() + " Para depois " + 
				c2.getBrincar());
		
		System.out.println(c3 + " O cachorro quis " + 
				c3.getLatir() + " o cachorro quer " + 
				c3.getCorrer() + " depois ele vai " + 
				c3.getDormir() + " Para depois " + 
				c3.getBrincar());
	}

}
