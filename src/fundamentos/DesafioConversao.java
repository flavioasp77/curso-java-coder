package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("|* Calcular m�dia 3 salarios *|");
		
		System.out.print("Digite o primeiro sal�rio: ");		
		String sal1 = scan.nextLine().replace(",",".");
		
		System.out.print("Digite o segundo sal�rio: ");		
		String sal2 = scan.nextLine().replace(",",".");
		
		System.out.print("Digite o terceiro sal�rio: ");		
		String sal3 = scan.nextLine().replace(",",".");
		
		double soma = Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3);
		
		double media = (soma / 3.0);
		
		System.out.printf("A m�dia dos 3 �ltimos sal�rios �: R$%.2f", media);
		
		scan.close();

	}
}
