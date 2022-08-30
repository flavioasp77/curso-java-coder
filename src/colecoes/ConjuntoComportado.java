package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new TreeSet<>(); // mantem a ordem de inserção
		SortedSet<String> listaAprovados = new TreeSet<>(); // Conjunto ordenado
		listaAprovados.add("Ana");
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		Set<Integer> nums = new HashSet<>(); // Somente valores do tipo inteiro
		nums.add(1);
		nums.add(10);
		nums.add(100);
		nums.add(1000);

		for (Integer num : nums) { 
			System.out.println(num);
		}

	}

}
