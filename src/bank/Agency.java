package bank;

import java.util.Scanner;

public class Agency {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Ente account holder: ");
		scan.nextLine();
		String hold = scan.nextLine();
		System.out.print("Is there an initial deposit (y/n): ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = scan.nextDouble();
			account = new Account(number, hold, initialDepositValue); 
		} else {
			account = new Account(number, hold);
		}
		
		System.out.println();

		System.out.println();
		System.out.print("Enter a daposit value: ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		
	

		
		scan.close();

	}

}
