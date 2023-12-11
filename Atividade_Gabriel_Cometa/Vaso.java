package Atividade_Gabriel_Cometa;

public class Vaso {
	//atributos
	//public String nome;
	//private int idade;
	private String cor;
	public String deco;
	private double tamanho;
	private String material;
	
	//metodos / metodo construtor
	//construtor padrao
		public Vaso() {
			
		}
		//construtor com parametros
		public Vaso(String cor, double tamanho, String material) {
			this.cor = cor;
			this.tamanho = tamanho;
			this.material = material;
		}
		
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public void exibirDeco2() {
		System.out.println("A cor do vaso " + getCor() + "O material do vaso: " + getMaterial() +
				"Tamanho do vaso: " + getTamanho() + "Decoracao: " 
				+ deco);
	}
	public void deco(String next) {	
	}
	
	/*
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public void somar(int x, int y) {
		this.soma = x + y;
	}
	*/
	
	
	
	
	
	
	
	

}
