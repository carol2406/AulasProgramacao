package aula2404;

import java.util.Scanner;

public class Arrayq04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [5];
		
		for (int i = 0; i <= 4; i++) {
			
			System.out.println("informe o" + (i + 1) + "numero:");
			numeros[i] = sc.nextInt(); 

	}
		for (int j = numeros.length-1; j >= 0; j--) {
			System.out.println(numeros [j]);
		}
		sc.close();
}
	
}
