package fundamentos.tipos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Flávio";
		var sobrenome = "Pires";
		var idade = 33;
		var salario = 3500.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário :" + salario + "\n");
		System.out.printf("O senhor %s %s tem %d de idade e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println("\n");
		String frase = String.format("O senhor %s %s tem %d de idade e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
