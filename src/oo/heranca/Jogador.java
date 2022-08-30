package oo.heranca;

public class Jogador {
	
	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y += 1;
			break;
		case LESTE:
			x += 1;
			break;
		case SUL:
			y -= 1;
			break;
		case OESTE:
			x -= 1;
		}
		return true;
	}
}
