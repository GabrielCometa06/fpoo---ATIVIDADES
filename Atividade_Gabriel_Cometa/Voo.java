package Atividade_Gabriel_Cometa;

public class Voo extends Passagem {
	
	private String numeroVoo;
	private String origem;
	private String destino;
	private double preco;
	private String dataIda;
	private String dataVolta;
	
	public Voo () {
		
	}
	
	public Voo (String numeroVoo, String origem, String destino, double preco, String dataIda, String dataVolta) {
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}
	
	public String getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getOrigem () {
		return origem;
	}
	public void setOrigem (String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataIda() {
		return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta () {
		return dataVolta;
	}
	public void setDataVolta (String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public void exibirVoo() {
		System.out.println(" Nota do voo: " + getDataIda() + getDataVolta() + getDestino() + getNumeroVoo());
	}
}