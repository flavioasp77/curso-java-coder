package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Ambos adicionam elementos na fila
		// A diferen�a � o comportamento qdo a fila est� cheia
		fila.add("Ana");
		fila.add("Fl�vio");
		fila.add("Pedro");
		fila.offer("Paulo");
		fila.offer("Carlos");
		fila.offer("Luiz");
		
		// Amobs obtem os pr�ximos elementos da fila sem remover
		System.out.println(fila.peek()); // retorna null qdo a fila est� vazia
		System.out.println(fila.element()); // retorna uma exe��o ado a fila est� vazia
		
//		fila.size(); mosta o tamanho da fila
//		fila.clear(); limpa a fila
//		fila.isEmpty(); verifica se a fila est� vazia
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
