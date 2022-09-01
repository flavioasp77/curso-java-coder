package oo.heranca.desafio;

public class Carro {
	
	int velocidade = 0;
	final int VELOCIDADE_MAXIMA;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		velocidade += 5;
		System.out.println("Velocidade atual: " + velocidade);
	}
	
	void frear() {
		if (velocidade >= 5 ) {
			velocidade -= 5;
			System.out.println("Freou. Velocidade atual: " + velocidade);
		
		} else {
			velocidade = 0;
			System.out.println("Carro parado");
		}
			
	}
}
