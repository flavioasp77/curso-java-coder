package oo.polimorfismo;

public class Comida {
	
	private double peso;
	private String nome;
	
	public Comida(double peso) {
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
