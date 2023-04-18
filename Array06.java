package aula1804;

import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int [5];
		int[] B = new int [5];
				
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("informe o " + (i + 1) + "numero :");
			A[i] = entrada.nextInt();
			B[i] = A[i];
	}
		System.out.println("/n valores dos vetores A");
		for (int i = 0; i < A.length; i++ ) {
			System.out.println("valor :" + A[i]);
			
	}
		System.out.println("/n valores dos vetores B");
		for (int i = 0; i < B.length; i++ ) {
			System.out.println("valor :" + B[i]);
		
}
}
}
	