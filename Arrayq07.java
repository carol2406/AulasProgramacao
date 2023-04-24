package aula2404;

import java.util.Scanner;

public class Arrayq07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int[] A = new int [2];
		int[] B = new int [3];
		int[] C = new int [5];
		
		//criando o vetor A
		for (int i = 0; i < A.length; i++ ) {
		System.out.println("[vetor A]informe o" + (i + 1) + "numero:");
		A[i] = sc.nextInt();
	}

		//criando o vetor B
				for (int i = 0; i < A.length; i++ ) {
				System.out.println("[vetor B]informe o" + (i + 1) + "numero:");
				B[i] = sc.nextInt();
}
		
				for (int i = 0; i < A.length; i++ ) {
				C[i] = A[i];
	}
				
				for (int i = 2; i < B.length; i++ ) {
					C[i] = B[i - 2];
}
				for (int i = 0; i < C.length; i++ ) {
					C[A.length + 1] = B[i];
	}
				sc.close();
}
}


