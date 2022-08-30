package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Pr�ncipe"); // retorna true ou false
		livros.push("Dom Quixote"); // n�o retorna nada ou gera um exe��o caso tente adicionamr mais que a capacidade
		livros.push("O Hobbit"); // n�o retorna nada ou gera um exe��o caso tente adicionamr mais que a capacidade
		
		for(String livro : livros) {
			System.out.println("O livro �: " + livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
						
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		
//		livros.size();
//		livros.clear();
//		livros.contains("...");
//		livros.isEmpty();
		
		
		
	}
}
