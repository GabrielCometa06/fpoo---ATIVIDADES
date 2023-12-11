package Atividade_Gabriel_Cometa;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private String sexo;
	private int QtdPatas;
	private String latir;
	private String correr;
	private String dormir;
	private String brincar;
	
	//construtores
		public Cachorro() {
			
		}
		public Cachorro(String nome, float peso, String sexo, int QtdPatas) {
			this.nome = nome;
			this.peso = peso;
			this.sexo = sexo;
			this.QtdPatas = QtdPatas;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome (String nome) {
			this.nome = nome;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso (float peso) {
			this.peso= peso;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo (String sexo) {
			this.sexo = sexo;
		}
		public int getQtdPatas() {
			return QtdPatas;
		}
		public void setQtdPatas (int QtdPatas) {
			this.QtdPatas = QtdPatas;
		}
		public String getLatir() {
			return latir;
		}
		public void setLatir (String latir) {
			this.latir = latir;
		}
		public String getCorrer() {
			return correr;
		}
		public void setCorrer (String correr) {
			this.correr = correr;
		}
		public String getDormir() {
			return dormir;
		}
		public void setDormir (String dormir) {
			this.dormir = dormir;
		}
		public String getBrincar() {
			return brincar;
		}
		public void setBrincar (String brincar) {
			this.brincar = brincar;
		}
}
