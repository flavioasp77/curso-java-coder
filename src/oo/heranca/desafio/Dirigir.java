package oo.heranca.desafio;

public class Dirigir {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();

		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
	}

}
