package oo.heranca.desafio;

public class Civic extends Carro {
	
	@Override
	void acelerar() {
		if (velocidade < 180) super.acelerar();
		else System.out.println("Atingiu a velocidade m�xima");
	}
	
	void frear() {
		super.frear();
			
	}

}
