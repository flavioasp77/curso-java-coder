package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a média: ");
		double media = scan.nextDouble();
		String resultadoparcial = media >= 5.0 ? "em recuperação!" : "reprovado!";
		String resultadoFinal = media >= 7.0 ? "aprovado!" : resultadoparcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		scan.close();
	}
	
}
