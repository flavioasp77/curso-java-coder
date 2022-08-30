package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Ambos adicionam elementos na fila
		// A diferença é o comportamento qdo a fila está cheia
		fila.add("Ana");
		fila.add("Flávio");
		fila.add("Pedro");
		fila.offer("Paulo");
		fila.offer("Carlos");
		fila.offer("Luiz");
		
		// Amobs obtem os próximos elementos da fila sem remover
		System.out.println(fila.peek()); // retorna null qdo a fila está vazia
		System.out.println(fila.element()); // retorna uma exeção ado a fila está vazia
		
//		fila.size(); mosta o tamanho da fila
//		fila.clear(); limpa a fila
//		fila.isEmpty(); verifica se a fila está vazia
//		fila.contains(...); verifica se existe um elemento na lista 
		
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
		System.out.println(fila.poll()); // mostra e remove o primeiro elemento da lista. Se a fila estiver vazia retorna null
	
		
	}
}
