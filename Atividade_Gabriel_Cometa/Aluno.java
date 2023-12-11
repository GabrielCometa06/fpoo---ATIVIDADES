package Atividade_Gabriel_Cometa;

import java.util.Scanner;

public class Aluno extends Pessoa {
	Scanner entrada = new Scanner(System.in);
	// metodo construtor
	
	/*
		public Aluno() {
		super();
		setCelular(super.getCelular());
		setCpf(super.getCpf());
		setTelefone(super.getTelefone());
		setEndereco(super.getEndereco());
		setNome(super.getNome());
		System.out.println("imprimi na classe Pessoa");
		super.metodoImprimir();
	}
	*/
	
			boolean mediaAluno;
			public void calcularMedia() {
			int va1 = 0, va2 = 0, va3 = 0;
	        int media, i, mediaNota = 0;
	        
	        media = 7;
			@SuppressWarnings("unused")
			int Aluno = 0;
			Aluno++;	
	        for (i = 0; i < 7; i++);
	        
	        int valNota = 0;
			//primeira nota do aluno
	        System.out.println("nota" + valNota + ", digite sua primeira nota:" );
	        int not1 = entrada.nextInt();
	        
	        //Segunda nota do aluno
	        System.out.println("nota" + valNota + ", digite sua segunda nota:" );
	        int not2 = entrada.nextInt();
	        
	        //terceira nota do aluno
	        System.out.println("nota" + valNota + ", digite sua terceira nota:" );
	        int not3 = entrada.nextInt();
	        
	     //calcula a média
            media = (va1 + va2 + va3) / 3;
            System.out.println("A média do aluno " + valNota + " é " + media);
            
            if(media >= 7) {
            	System.out.println("!Aprovado");
            }if (media < 7){
            	System.out.println("!Reprovado");
          }
			}
}
