package Atividade_Gabriel_Cometa;

import java.util.List;
public class Banda {
	private String nome;
	private List<MembroBanda> banda;
	
	public Banda() {
		
	}
	public Banda(String nome, List<MembroBanda> banda) {
		this.nome = nome;
		this.banda = banda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void produzirShow() {
		System.out.println(" Entrando no palco... " + getNome());
	}
	public void introduzirMembros(MembroBanda membros) {
		banda.add(membros);
	}
	public void exibirMembros() {
		System.out.println(" Os membros da banda são: " + getNome());
	}
}
