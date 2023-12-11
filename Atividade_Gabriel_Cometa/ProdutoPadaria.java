package Atividade_Gabriel_Cometa;

public class ProdutoPadaria implements Produto {
	//atributos
	private String nome;
	private double preco;
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public void exibir() {
		System.out.println(" Notas: " + getPreco());
	}
	
	}


