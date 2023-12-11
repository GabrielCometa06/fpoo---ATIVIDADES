package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int m = entrada.nextInt();
		int x = entrada.nextInt();// referente às figurinhas compradas/coladas
		
		int [] album = {10, 3, 5, 12};
		
		
		if (m == album [n]) {
			System.out.println("Figurinhas repetidas");
		}
		
		if (m != album [x]) {
			System.out.println("Figurinhas novas");
		}
		
		if (n == album [m]) {
			System.out.println("album completo");
		}
			
	}
	
}
