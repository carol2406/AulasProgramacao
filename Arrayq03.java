package aula2404;

import java.util.Scanner;

public class Arrayq03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] colecao = new int [5];
		
		for (int i = 0; i < colecao.length; i++) {
			
			System.out.println("informe o" + (i + 1) + "numero:");
			int numero = sc.nextInt(); 
					
			if (numero % 2 == 0) {
				numero *=3;
			} else {
				numero += 1;
			} 	
			colecao [i] = numero;
		}
		for (int i : colecao ) {
			System.out.println(i);
		}
		sc.close();
	}

}
