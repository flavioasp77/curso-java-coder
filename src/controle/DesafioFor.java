package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";		
		for(int i = valor.length(); i <= 5; i +=1) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String v = "#"; !v.equals("######") ; v += "#") {
			System.out.println(v);
		}
	}
}
