package Atividade_Gabriel_Cometa;

public class Brinquedo2 {
private String nome;
private double alturaMinima;
private int capacidadeMaxima;
private double altura;
//metodo constructor
public Brinquedo2 () {
	
	}	
public Brinquedo2 (String nome, double alturaMinima, int capacidadeMaxima) {
	this.nome = nome;
	this.alturaMinima = alturaMinima;
	this.capacidadeMaxima = capacidadeMaxima;
	}
//metodos de getters e setters
public String getNome () {
	return nome;
	}
public void setNome (String nome) {
	this.nome = nome;
	}
public double getAlturaMinima () {
	return alturaMinima;
	}
public void setAlturaMinima (double altura) {
	this.altura = altura;
	}
public int getCapacidadeMaxima () {
	return capacidadeMaxima;
	}
public void setCapacidadeMaxima (int capMaxima) {
	this.capacidadeMaxima = capMaxima;
	}
//metodos especiais
public void exibirInfo() {
	System.out.println("Brinquedo: " + nome);
	System.out.println("Altura Minima: " + alturaMinima);
	System.out.println("Capacidade Maxima: " + capacidadeMaxima + "pessoas");
	
	}
}
