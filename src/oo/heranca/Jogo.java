package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		
		j1.x = 10;
		j1.y = 10;
	
		j1.andar(Direcao.NORTE);
		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
		j1.andar(Direcao.LESTE);
		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
		j1.andar(Direcao.SUL);
		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
		j1.andar(Direcao.OESTE);
		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
		
	}
}
