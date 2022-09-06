package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		 Pessoa pessoa = new Pessoa(70);
		 
		 Comida arroz = new Arroz("Arroz a grega", 0.25);
		 Comida feijao = new Feijao("Feijão tropeiro", 0.18);
		 Comida sorvete = new Sorvete("Sorvete de morango", 0.300);
		 
		 System.out.println(pessoa.getPeso());
		 
		 
		 pessoa.comer(arroz);
//		 System.out.printf("Estou pesando %.2f kilos.\n", pessoa.getPeso());
		 
		 pessoa.comer(feijao);
//		 System.out.printf("Estou pesando %.2f kilos.\n", pessoa.getPeso());
		 
		 pessoa.comer(sorvete);
//		 System.out.printf("Estou pesando %.2f kilos.\n", pessoa.getPeso());


	}

}
