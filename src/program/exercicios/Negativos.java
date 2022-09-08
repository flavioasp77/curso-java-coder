package program.exercicios;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int quantity = scan.nextInt();
		int[] nums = new int[quantity];
		
		for (int i = 0; i < quantity ; i += 1) {
			scan.nextLine();
			System.out.print("Digite um numero: ");
			int num = scan.nextInt();
			nums[i] = num;
		}
		
		System.out.println("\nN�meros negativos:");
		
		for ( int num : nums) {
			if (num < 0) {
				System.out.println(num);
			}
		}		
		
		scan.close();

	}

}
