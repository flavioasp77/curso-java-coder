package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data();
//		data1.dia = 11;
//		data1.mes = 8;
//		data1.ano = 1977;
		
		Data data2 = new Data(11, 8, 1977);
		
		String data = data2.obterDataFormatada();
		
		System.out.println(data);
		System.out.println(data1);
	}
}
