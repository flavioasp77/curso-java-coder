package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanhe é: " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanhe é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.contains("teste"));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
	
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // interseção entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // união entre dois conjuntos
		System.out.println(nums);
		
		conjunto.clear(); // limpa o conjunto
		System.out.println(conjunto);

		
		
		
		
				
	}
}
