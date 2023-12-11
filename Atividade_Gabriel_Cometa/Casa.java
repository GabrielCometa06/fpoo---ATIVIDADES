package Atividade_Gabriel_Cometa;

public class Casa {

	private String cor;
	private float preco;
	private float metragem;
	private Quarto quarto;
	private Sala sala;
	private int qtdQuarto;
	private int qtdSala;

	public  Casa() {
	}
	
	public Casa(String cor, float preco, float metragem, Quarto quarto, Sala sala, int qtdQuarto, int qtdSala) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.quarto = quarto;
		this.sala = sala;
		this.qtdQuarto = qtdQuarto;
		this.qtdSala = qtdSala;
	}

	public int getQtdQuarto() {
		return qtdQuarto;
	}
	public void setQtdQuarto(int qtdQuarto) {
		this.qtdQuarto = qtdQuarto;
	}
	public int getQtdSala() {
		return qtdSala;
	}
	public void setQtdSala(int qtdSala) {
		this.qtdSala = qtdSala;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public void mostrarDetalhes() {
		System.out.println("A casa da cor " + getCor() + ", custa " + getPreco() + " e mede " + getMetragem() + "m tem " +
	getQtdQuarto() + " quartos e " + getQtdSala() + " salas.");
	}
}