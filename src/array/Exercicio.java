package array;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.4;
		notasAlunoA[1] = 5;
		notasAlunoA[2] = 5.1;
		
		String notas = Arrays.toString(notasAlunoA);
		System.out.println(notas);	
		
		double total = 0;
		
		for (double notaAlunoA : notasAlunoA) {
			total += notaAlunoA;
		}
		
		double media = total / notasAlunoA.length;
		System.out.printf("A média é: %.2f.", media);
	}
}
