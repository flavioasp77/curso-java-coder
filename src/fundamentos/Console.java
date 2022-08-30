package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		System.out.println("Bom");
		System.out.println("dia!");
		System.out.printf(
				"Megasena %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário R$ %.2f %n", 3500.00); // %n quebra a linha
		
		System.out.println("******** Programinha ***********");
		
		Scanner entrada = new Scanner(System.in); // abre a entrada de dados
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu salário: ");
		double salario = entrada.nextDouble();
		
		System.out.printf(
				"%s %s tem %d anos e ganha R$%.2f %n",
				nome, sobrenome, idade, salario);
		
		entrada.close(); // fecha a entrada de dados para não ficar ocupando recursos
		
	}
}
