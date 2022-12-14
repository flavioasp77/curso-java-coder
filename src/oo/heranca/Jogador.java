package oo.heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {		
		int deltaX = Math.abs(x - oponente.x); 
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -=10;
			return true;
		} else if (deltaX == 1 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}	
	}
	
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
