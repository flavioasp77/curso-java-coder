package oo.encapsulamento;

public class Pessoa {
	
	private String nome;	
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade (int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 || idade <= 120 )
		this.idade = idade;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Meu nome é "
				+ getNome()
				+ " e tenho "
				+ getIdade() + " anos.";
	}
	
	

}
