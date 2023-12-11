package Atividade_Gabriel_Cometa;

public class MountainBike implements Veiculo {
	//atributos
	public int velocidade;
	public int marcha;
	public int acelerar;
	private int frear;
	
	@Override
	public void frear() {
		System.out.println(" Freiando Veículo... ");
	}

	@Override
	public void setMudarMarcha() {
		this.marcha = marcha +1;
	}
	@Override
	public void estado() {
		System.out.println(" Andando na marcha" + marcha + "Na velocidade" + velocidade + "Km/h");
	}

	@Override
	public int velocidade() {
		return velocidade;
	}

	@Override
	public void setVeloidade() {
		this.velocidade = velocidade +1;
		this.velocidade = velocidade -1;
	}
	
	@Override
	public int getVelocidade(int velocidade) {
		return velocidade;
	}

	@Override
	public int getMudarMarcha(int mudarMarcha) {
		return mudarMarcha;
	}
	
	@Override
	public int getAcelerar(int acelerar) {
		return acelerar;
	}
	@Override
	public void setAcelerar() {
		this.acelerar = acelerar +1;
	}
	@Override
	public int getFrear(int frear) {
		return frear;
	}
	@Override
	public void setFrear() {
		this.frear = frear +1;	
	}
}
