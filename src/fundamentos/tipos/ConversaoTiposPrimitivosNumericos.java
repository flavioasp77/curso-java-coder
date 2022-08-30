package fundamentos.tipos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // convertido um int em um double
		
		float b = 1.0F; // conversão de double para float já qie o padrão é double
		
		float c = (float) 1.0; // conversão explicita (CAST) de double em float já que o padrão é double
		
		int d = 4;
		
		byte e = (byte) d; // vai gerar um valor correto até 127
		
		double f = 1;
		int g = (int) f;
	}
}
