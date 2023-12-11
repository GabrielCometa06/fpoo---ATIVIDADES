package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Albumcompleto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();// quantidade de espaço no album
		int m = entrada.nextInt();//quantidade de fig compradas
		//dica!!! utilize uma variavel booleana para verificar se tem ou nao a figurinha
		Boolean[] ja_tenho = new Boolean[n];//true or false
		int x = 0; //fig compradas
		//varrendo o vetor
		for (int i = 0; i < n; i++) {
			ja_tenho[i] = false;
			// fig que ja temos!
			for(int i1 = 0; i1 < m; i1++) {
				x = entrada.nextInt();
				ja_tenho[x] = true;
			}
			int repetidas = 0;
			//vamos marcar as repetidas 
			for(int i1 = 0; i1 < n; i1++) {
				if(ja_tenho[i1]);
				repetidas = repetidas + 1; // ou.... repetidas++
			}
			//vamos contar a quantide de fig repetidas
			System.out.println("quantidade de figurinhas repetidas = " + (n - repetidas));
			System.out.println("quantidade de figurinhas repetidas = " +  repetidas);
			System.out.println("tamanho do album = " + n);
			System.out.println("quantidade de figurinhas = " + m);
		}

	}

}
