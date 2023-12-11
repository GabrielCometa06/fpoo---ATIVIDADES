package Atividade_Gabriel_Cometa;

import java.util.ArrayList;
import java.util.Scanner;
public class TesteVazo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		/*
		Pessoa bebe = new Pessoa(); // construtor Pessoa() pq preciso p instanciar obj da classe Pessoa
		bebe.nome="jorge";
		bebe.tamanho=0.8;
		bebe.chorar();
		bebe.mamar();
		bebe.dormir();
		bebe.idade=1;
		bebe.setIdade(1);
		bebe.somar(2,8);
		*/
		
		//todo metodo tem parenteses (com ou sem parametros)
		
		
		
		
		// instancia o objeto

		System.out.println("instanciar vaso!! ");
		
		ArrayList<Vaso> Vaso = new ArrayList<Vaso>();
			for (int i = 0; i < 2; i++) {
				

				if (tipo.equalsIgnoreCase("Vaso")) {
					Vaso v1 = new Vaso(null, 0, null);

					System.out.println("tamanho: ");
					v1.setTamanho(entrada.nextDouble());
					System.out.println("cor: ");
					v1.setCor(entrada.next());
					System.out.println("Material: ");
					v1.setMaterial(entrada.next());
					System.out.println("Vaso Decorado acabou de ser instanciado!!!");
					Vaso vaso;
				}
			}
		

		
		v1.exibirDeco2();

		VasoDecorado v2 = new VasoDecorado();
		System.out.println("tamanho: ");
		v2.setTamanho(entrada.nextDouble());
		System.out.println("cor: ");
		v2.setCor(entrada.next());
		System.out.println("Material: ");
		v2.setMaterial(entrada.next());
		System.out.println("Decoração: ");
		v2.deco(entrada.next());
		System.out.println("Vaso Decorado acabou de ser instanciado!!!");
		v2.exibirDeco();
	}
	vaso.add
}