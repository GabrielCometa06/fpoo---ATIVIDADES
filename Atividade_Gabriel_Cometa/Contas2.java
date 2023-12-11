package Atividade_Gabriel_Cometa;

public class Contas2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o valor disponível");
		int Valor = entrada.nextInt();
		int Açougue = entrada.nextInt();
		int Padaria = entrada.nextInt();
		int Farmacia = entrada.nextInt();
		
		if (Valor >= (Açougue + Farmacia + Padaria)) {
			System.out.println("3");
		}else if (Valor >= (Açougue + Farmacia) || Valor >= (Açougue + Padaria)) {
			System.out.println("2");
		}else if (Valor >= Açougue || Valor >= Farmacia || Valor >= Padaria) {
			System.out.println("1");
		}
		
		

	}

}
