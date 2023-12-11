package Atividade_Gabriel_Cometa;

import java.util.Scanner;
public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Voo v1 = new Voo();
		Voo v2 = new Voo();
		Voo v3 = new Voo();
		
		System.out.println("---VOO1---");
		System.out.println(" Digite sua ida: ");
		v1.setDataIda(entrada.next());
		System.out.println(" Digite sua volta: ");
		v1.setDataVolta(entrada.next());
		System.out.println(" Digite seu destino: ");
		v1.setDestino(entrada.next());
		System.out.println(" Digite o numero do seu voo: ");
		v1.setNumeroVoo(entrada.next());
		
		v1.exibirVoo();
		Passagem p1 = new Passagem();
		
		System.out.println("---VOO1---");
		System.out.println(" Digite sua ida: ");
		v2.setDataIda(entrada.next());
		System.out.println(" Digite sua volta: ");
		v2.setDataVolta(entrada.next());
		System.out.println(" Digite seu destino: ");
		v2.setDestino(entrada.next());
		System.out.println(" Digite o numero do seu voo: ");
		v2.setNumeroVoo(entrada.next());
		
		v2.exibirVoo();
		Passagem p2 = new Passagem();
		
		System.out.println("---VOO1---");
		System.out.println(" Digite sua ida: ");
		v3.setDataIda(entrada.next());
		System.out.println(" Digite sua volta: ");
		v3.setDataVolta(entrada.next());
		System.out.println(" Digite seu destino: ");
		v3.setDestino(entrada.next());
		System.out.println(" Digite o numero do seu voo: ");
		v3.setNumeroVoo(entrada.next());
		
		v3.exibirVoo();
		Passagem p3 = new Passagem();
		
		
	}

}
