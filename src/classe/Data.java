package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // chama outro construtor da classe - Data()
	}
	
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada( ) {
		System.out.println(this.obterDataFormatada());
	}
}
