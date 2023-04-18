package aula1804;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int[]notas = new int [4];
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("informe a nota :");
			notas[i] = entrada.nextInt();
	}
		for (int i = 0; i <= 3; i++) {
			System.out.println("posição["+ i +"] : " + notas [i]);
		}
			{
			}
	}
}
