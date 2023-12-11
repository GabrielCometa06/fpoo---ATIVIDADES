package Atividade_Gabriel_Cometa;

public class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;


//construtor
	public Pessoa() {
		System.out.println("Construtor");
	}
	public void metodoImprimir() {
		System.out.println("imprimir classe Pessoa");
	}
	public void setTelefone (int telefone ) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setCpf (int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
}
