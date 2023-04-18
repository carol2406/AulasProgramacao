package aula1804;

import java.util.Scanner;

public class Array2JeitoDeFazer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int[]notas = new int [4];
		int soma = 0;
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("informe a nota :");
			notas[i] = entrada.nextInt();
			soma = soma + notas[i];
	}
		double media = soma / 4;
		System.out.println("a media he :" + media);
}
}