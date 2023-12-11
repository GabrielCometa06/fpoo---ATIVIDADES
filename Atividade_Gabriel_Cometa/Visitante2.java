package Atividade_Gabriel_Cometa;

public class Visitante2 {
	//atributos
	private String nome;
	private int idade;
	private double altura;
	//construtor
	public Visitante2(){
		
	}
	public Visitante2(String n, int idade, double altura){
		this.nome = n;
		this.idade = idade;
		this.altura = altura;
	}
	//metodos getters setters
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setNome (double altura) {
		this.altura = altura;
	}
	//metodo especial
	public boolean podeAndarNoBrinquedo() {
		if (altura >= 10 && altura > 1.2) {
			return true;
		}else {
			return false;
		}
	}

public void exibirInfo() {
	System.out.println("Visitante: " + nome);
	System.out.println("Idade: " + idade + "anos");
	System.out.println("Altura: " + altura + "m");
	}
}