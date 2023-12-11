package Atividade_Gabriel_Cometa;

import java.util.Scanner;
public class Contas {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		int açougue;
		int padaria;
		int farmacia;
		
		System.out.println("Valor das receitas aqui!");
		valor = entrada.nextInt();
		
		System.out.println("Valor do açougue");
		açougue = entrada.nextInt();
		
		System.out.println("Valor da padaria");
		padaria = entrada.nextInt();
		
		System.out.println("Valor da farmacia");
		farmacia = entrada.nextInt();

		if (valor >= (açougue + farmacia + padaria )) {
			System.out.println("pagou as 3 contas");
		}else if (açougue + farmacia || farmacia + padaria || açougue + padaria) {
			System.out.println("não é possível pagar as contas");
		}	

	}

}