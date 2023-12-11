package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Coralverdadeiro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int [] cobra = new int [4];
		
		cobra [0] = entrada.nextInt();
		cobra [1] = entrada.nextInt();
		cobra [2] = entrada.nextInt();
		cobra [3] = entrada.nextInt();
		cobra [4] = entrada.nextInt();
		
		if (cobra [0] == cobra [2] || cobra[1] == cobra [3]) {
			System.out.println("verdade");
		}else	
			System.out.println("falso");
		
	}
	
	}


