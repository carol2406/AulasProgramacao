package aula1704;

import java.util.Scanner;

public class IntDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int soma = 0, valor = 0;

		do {
			System.out.println("informe 0 para sair ou QQ numero  para somar");
			valor = entrada.nextInt();
			soma += valor;
			System.out.println("a soma he :" + soma);
		} while (valor != 0);
		System.out.println("o programa acabou!!!!");
	}

}
