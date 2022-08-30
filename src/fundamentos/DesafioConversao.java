package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("|* Calcular média 3 salarios *|");
		
		System.out.print("Digite o primeiro salário: ");		
		String sal1 = scan.nextLine().replace(",",".");
		
		System.out.print("Digite o segundo salário: ");		
		String sal2 = scan.nextLine().replace(",",".");
		
		System.out.print("Digite o terceiro salário: ");		
		String sal3 = scan.nextLine().replace(",",".");
		
		double soma = Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3);
		
		double media = (soma / 3.0);
		
		System.out.printf("A média dos 3 últimos salários é: R$%.2f", media);
		
		scan.close();

	}
}
