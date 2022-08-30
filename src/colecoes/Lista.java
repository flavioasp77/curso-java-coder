package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Flávio"));
		lista.add(new Usuario("Fabio"));
		lista.add(new Usuario("Diogo"));
		lista.add(new Usuario("Luciano"));
		lista.add(new Usuario("Luiz"));
		lista.add(new Usuario("Luiz"));
		
		System.out.println(lista.get(3)); // usando o metodo toString da classe Usuario
		
//		System.out.println(lista.get(3).nome);
//		
//		for(Usuario u : lista) {
//			System.out.println(u.nome);
//		}
		
		
		System.out.println(">>>>>>" + lista.remove(0));
		System.out.println(lista.remove(new Usuario("Luiz")));

		System.out.println("Tem Flávio? " + (lista.contains(new Usuario("Flávio")) ? "sim" : "não"));
		System.out.println("Tem Diogo? " + (lista.contains(new Usuario("Diogo")) ? "sim" : "não"));

		for(Usuario u : lista) {
			System.out.println(u);
		}
		

	}

}
