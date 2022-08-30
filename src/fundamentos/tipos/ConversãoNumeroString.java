package fundamentos.tipos;

public class ConversãoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000;		
		System.out.println(num1.toString().length());
		
		int num2 = 10;
		System.out.println(Integer.toString(num2).length());
		
		Long.toString(num2);
		Double.toString(num2);
	}

}
