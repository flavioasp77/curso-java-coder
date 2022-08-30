package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";		
		System.out.println(s1.concat("!!!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data(): null;
		
		System.out.println(d1);
		
		String s2 = null;
		System.out.println(s2.concat("????????")); // vai gerar um erro de NullPointer
	}
}
