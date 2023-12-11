package Atividade_Gabriel_Cometa;

import java.util.List;
public class MembroBanda {
	private String nome;
	private List<Banda> membro;
	
	public MembroBanda() {
		
	}
	public MembroBanda(String nome, List<Banda> membro) {
		this.setNome(nome);
		this.setMembro(membro);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Banda> getMembro() {
		return membro;
	}
	public void setMembro(List<Banda> membro) {
		this.membro = membro;
	}
	public void exibirMembros() {
		System.out.println(" Os membros da banda são: " + getNome());
	}
}
