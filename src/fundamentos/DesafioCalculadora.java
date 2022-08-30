package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculadora\n");
		System.out.print("digite o primeiro n�mero: ");		
		double num1 = scan.nextDouble();
		System.out.print("digite o segundo n�mero: ");		
		double num2 = scan.nextDouble();
		System.out.print("digite a opera��o ([+] - [-] - [*] - [/] - [%]): ");		
		String op = scan.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("\n %.2f %s %.2f = %.2f ", num1, op, num2, resultado);
		
		scan.close();
	}
}
