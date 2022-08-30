package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "branca";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "roxa":
			System.out.println("Sei o Tekki Shodan");
		case "verde":
			System.out.println("Sei o Heian Godan");
		case "laranja":
			System.out.println("Sei o Heian Yodan");
		case "vermelha":
			System.out.println("Sei o Heian Sandan");
		case "amarela":
			System.out.println("Sei o Heian Nidan");
			break;
		default:	
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!");
	}
}
