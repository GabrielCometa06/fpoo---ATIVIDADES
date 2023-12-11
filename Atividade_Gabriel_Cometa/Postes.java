package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//criar as variaveis
		
		int n = entrada.nextInt(); //indicando o numero de postes
		int substituidos = 0; //indicando os tamanhos dos postes pós incendio
		int consertados = 0;
		
		for(int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			if (x < 50) {
				substituidos++;
			}
			if (50 <= x && x < 85) {
				consertados++;
			}
		}
		System.out.println(substituidos + "----" + consertados);
		
		
	}
	

}
