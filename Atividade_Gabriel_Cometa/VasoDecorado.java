package Atividade_Gabriel_Cometa;

public class VasoDecorado extends Vaso{
	//atributos
	public String deco;
	private String decorado1;
	//metodos
	public VasoDecorado() { //padrao
		super();
	}

		public String getDecorado1() {
			return decorado1;
		}
		public void setDecorado(String decorado) {
			this.decorado1 = decorado;
		}
		
		public void exibirDeco() {
			System.out.println("A cor do vaso " + getCor() + " O material do vaso: " + getMaterial() +
					" Tamanho do vaso: " + getTamanho() + " Decoracao: " 
					+ deco);
		}
		public String getDeco(String deco) {
			return deco;
		}
		public void setDeco(String deco) {
			this.deco = deco;
		}
	}
	

