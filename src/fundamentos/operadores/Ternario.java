package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a m�dia: ");
		double media = scan.nextDouble();
		String resultadoparcial = media >= 5.0 ? "em recupera��o!" : "reprovado!";
		String resultadoFinal = media >= 7.0 ? "aprovado!" : resultadoparcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		scan.close();
	}
	
}
