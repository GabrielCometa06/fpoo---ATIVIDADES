package Atividade_Gabriel_Cometa;

import java.util.Scanner;
public class TesteBike {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		SpeedBike spd = new SpeedBike();
		MountainBike mb = new MountainBike();
		
		System.out.println("---SPEEDBIKE---");
		System.out.println(" Trocar marcha: ");
		spd.setMudarMarcha();
		System.out.println(" Acelere: ");
		spd.setAcelerar();
		System.out.println(" Frear");
		spd.setFrear();
		
		System.out.println("---SPEEDBIKE---");
		System.out.println(" Trocar marcha: ");
		mb.setMudarMarcha();
		System.out.println(" Acelere: ");
		mb.setAcelerar();
		System.out.println(" Frear");
		mb.setFrear();
		
		BikePessoa p1 = new BikePessoa();
		BikePessoa p2 = new BikePessoa();
		
		p1.setNome("Maura");
		p2.setNome("Luis");
		
		System.out.println(p1 + "Subiu na Bike!" + spd.setMudarMarcha() +
				"Marcha alterada!" + spd.setVeloidade() + 
				"Velocidade aumentada!" + spd.setVeloidade() + 
				"Velocidade diminuída!");
		
		System.out.println(p2 + "Subiu na Bike!" + mb.setMudarMarcha() +
				"Marcha alterada!" + mb.setVeloidade() + 
				"Velocidade aumentada!" + mb.setVeloidade() + 
				"Velocidade diminuída!");
	}

}
