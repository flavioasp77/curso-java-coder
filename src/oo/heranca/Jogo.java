package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro mostro = new Monstro();		
		mostro.x = 10;
		mostro.y = 10;
		
		Monstro mostro2 = new Monstro(9, 8);	
		
		Heroi heroi = new Heroi(10, 11);		
	
		
		System.out.println("Vida Inicial");
		System.out.println("Vida Monstro: " + mostro.vida);
		System.out.println("Vida Heroi: " + heroi.vida);
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		mostro2.atacar(heroi);
		
		System.out.println("Vida apos ataque");
		System.out.println("Vida Monstro: " + mostro.vida);
		System.out.println("Vida Heroi: " + heroi.vida);
		
				
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		System.out.println("Vida apos ataque");
		System.out.println("Vida Monstro: " + mostro.vida);
		System.out.println("Vida Heroi: " + heroi.vida);
		
	
//		j1.andar(Direcao.NORTE);
//		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
//		j1.andar(Direcao.LESTE);
//		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
//		j1.andar(Direcao.SUL);
//		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
//		j1.andar(Direcao.OESTE);
//		System.out.println("Posição: x = " + j1.x + ", j = " + j1.y);
		
	}
}
