package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na ter�a ou trabalho na quinta -> tv 32 e sai pra tomar sorvete
		// trabalho na ter�a e na quinta -> tv 50 e sai pra tomar sorvete
		// n�o trabalho -> sem tv e sem sorvete
		// sem sorvete -> mais sald�vel ou com fome
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean sorvete = false;
		
		System.out.println("Selecione uma das op��es abaixo:");
		System.out.println("1 - Trabalho na ter�a ou na quinta.");
		System.out.println("2 - Trabalho na ter�a e na quinta.");
		System.out.println("3 - Sem trabalho");
		System.out.print("Digite de 1 a 3: ");
		
		opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:
			trabalho1 = true;
			trabalho2 = false;
			sorvete = true;
		break;
		case 2:
			trabalho1 = true;
			trabalho2 = true;
			sorvete = true;
		break;
		case 3:
			trabalho1 = false;
			trabalho2 = false;
			sorvete = false;
		break;
		default:
			break;	
		}
		

		if (trabalho1 && trabalho2) {
			System.out.println("Comprou uma TV de 50\" e foi tomar sorvete!");
		} else if (trabalho1 || trabalho2) {
			System.out.println("Comprou uma TV de 32\" e foi tomar sorvete");
		} else {
			System.out.println("N�o comprou TV e n�o tomou sorvete!");
			if (!sorvete) {
				System.out.println("N�o tomou sorvete e ficou mais sald�vel");
			}
		}
		
		
		scan.close();
		
	}
}
