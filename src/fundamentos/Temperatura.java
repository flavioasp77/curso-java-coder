package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// converter °F em °C
		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double fahrenheit = 100;
		double celsios = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + "°F são " + celsios + "°C.");
		
		fahrenheit = 90;
		celsios = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + "°F são " + celsios + "°C.");
	}
	
}
