package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Flavio Pires");
		
		Compra compra1 = new Compra();
		
		compra1.adcionarItem("Caneta", 2.5, 10);
		compra1.adcionarItem("Notebook", 2500, 1);
		
		Compra compra2 = new Compra();
		compra2.adcionarItem("Caderno", 15, 5);
		compra2.adcionarItem("Impressora", 900, 1);
		
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
			
		System.out.println(cliente.obterValorTotal());
		
	}

}
