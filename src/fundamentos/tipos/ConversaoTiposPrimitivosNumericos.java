package fundamentos.tipos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // convertido um int em um double
		
		float b = 1.0F; // convers�o de double para float j� qie o padr�o � double
		
		float c = (float) 1.0; // convers�o explicita (CAST) de double em float j� que o padr�o � double
		
		int d = 4;
		
		byte e = (byte) d; // vai gerar um valor correto at� 127
		
		double f = 1;
		int g = (int) f;
	}
}
