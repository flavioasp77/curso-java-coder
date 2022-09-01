package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	@Override
	void acelerar() {
		if (velocidade <= 300) {
			velocidade += 15;
		System.out.println("Velocidade atual: " + velocidade);
		} else {
			System.out.println("Atingiu a velocidade máxima");			
		}		
	}
	
	@Override
	void frear() {
		if (velocidade >= 15 ) {
			velocidade -= 15;
			System.out.println("Freou. Velocidade atual: " + velocidade);
			
		} else {
			velocidade = 0;
			System.out.println("Carro parado");
		}
			
	}
}
