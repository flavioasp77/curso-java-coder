package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		// .put adciona ou substitui o valor de uma chave
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		usuarios.put(5, "Ronald");
		usuarios.put(6, "Rafael");
		
		System.out.println(usuarios.size()); // pega o tamanho
		System.out.println(usuarios.isEmpty()); // verifica se está vazio
		System.out.println(usuarios.keySet()); // pega as chaves (em um conjunto)		
		System.out.println(usuarios.values()); // paga os valores
		System.out.println(usuarios.entrySet()); // pega chave e valor
		System.out.println(usuarios.containsKey(2)); // verifica se existe a chave
		System.out.println(usuarios.containsValue("Ricardo")); // verifica se existe o valor
		System.out.println(usuarios.get(3)); // pega o valor pela chave
		System.out.println(usuarios.remove(1)); // remove pela chave
		System.out.println(usuarios.remove(3, "Rafaela")); // remove pela chave e valor
		
		// itera pelas chaves
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//itera pelo vaor
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		// pega chave e valor ao mesmo tempo -> atenção para a importação do Entry
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==> ");
			System.out.println(registro.getValue());
		}

	}

}
