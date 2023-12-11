package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		if(x < -8 || x > 8 || y < 0 || y > 0)
			System.out.println("N");
		else
			System.out.println("S");

	}

}
