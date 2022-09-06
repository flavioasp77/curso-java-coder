package oo.heranca.desafio;

public class Carro {
	
	protected int velocidade = 0;
	public final int VELOCIDADE_MAXIMA;
	private int delta = 5;	
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
			System.out.println("Velocidade atual: " + velocidade);
		} else {
			velocidade += getDelta();
			System.out.println("Velocidade atual: " + velocidade);
		}
		
		
	}
	
	void frear() {
		if (velocidade >= getDelta() ) {
			velocidade -= getDelta();
			System.out.println("Freou. Velocidade atual: " + velocidade);
		
		} else {
			velocidade = 0;
			System.out.println("Carro parado");
		}			
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
}
