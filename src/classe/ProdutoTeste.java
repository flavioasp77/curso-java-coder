package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook Dell", 4356.89);
		
		var p2 = new Produto();
		 p2.nome = "caneta preta";
		 p2.preco = 12.56;
		 
		Produto.desconto = 0.50; // altera o valor do desconto na classe e se aplica a todas as instâncias.
		
		System.out.println(p1.nome);		
		System.out.println(p2.nome);
		
		double precofinal1 = p1.precoComDesconto();		
		double precofinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precofinal1 + precofinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
		
	}
}
