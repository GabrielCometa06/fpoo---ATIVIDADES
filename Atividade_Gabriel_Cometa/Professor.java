package Atividade_Gabriel_Cometa;

public class Professor extends Pessoa {
	//nome desta classe
	public String nomeCurso;

//objetos
	float salario;

	public void Professor1() {
		System.out.println("T.I");
		System.out.println("Professor avaliando");
	}
	
	public void Professor2() {
		System.out.println("Filosofia");
		System.out.println("Professor avaliando");
	}
	
	public String getNomeCurso() {
		return this.nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}