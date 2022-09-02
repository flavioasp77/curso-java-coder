package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
		System.out.printf("Comi %s e estou pesando %.2f.\n", comida.getNome(), getPeso());
	}

	public final double getPeso() {
		return peso;
	}

	public final void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}		
	}
}

