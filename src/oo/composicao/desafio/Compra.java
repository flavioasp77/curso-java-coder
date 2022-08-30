package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
		
	final List<Item> itens = new ArrayList<>();

	
	void adcionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		Item item = new Item(produto, quantidade);
		this.itens.add(item);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
