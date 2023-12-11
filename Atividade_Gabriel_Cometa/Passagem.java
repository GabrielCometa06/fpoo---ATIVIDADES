package Atividade_Gabriel_Cometa;

public class Passagem {
	private Voo voo;
	private Cliente cliente;
	private double precoTotal;
	
	public Passagem() {
		
	}
	public Passagem(Voo Voo, Cliente cliente, double precoTotal) {
		
	}
	public Voo getVoo(){
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
