package oo.polimorfismo;

public abstract class Comida {
	
	private double peso;
	private String nome;
	
	public Comida(String nome, double peso) {
		setNome(nome);
		setPeso(peso);
	}

	public final double getPeso() {
		return peso;
	}

	public final void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
		
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
