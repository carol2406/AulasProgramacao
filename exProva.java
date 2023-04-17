package aula1704;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class exProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, resultado = 0;
		String op;
		
		do {
			System.out.println("imforme um valor: ");
			valor1 = entrada.nextInt();
			System.out.println("imforme um valor: ");
			valor2 = entrada.nextInt();
			System.out.println("operação: ");
			op = entrada.next();
			
			switch (op) {
			case "+":
				resultado = valor1 + valor2;
				System.out.println("O Resultado da Soma : " + resultado);
				break;
			case "-":
				resultado = valor1 - valor2;
				System.out.println("o resultado da subtrcao :" + resultado);
				break;
			case "*":
				resultado = valor1 * valor2;
				System.out.println("o resultado da multiplicação :" + resultado);
				break;
				
			case "/":
				resultado = valor1 / valor2;
				System.out.println("o resultado da divisão :" + resultado);
				break;

			default:
				System.out.println("valor negado!!!");
				
			}
			
			if (resultado > 0) {
				System.out.println("resultado maior q zero!!");
			}
			else if (resultado < 0) {
				System.out.println("resultado menor q zero!!");
			}
			else {
				System.out.println("resultado igual q zero!!");
			}
			
			System.out.println("Deseja continuar? ");
			valor1 = entrada.nextInt();
			
		} while (valor1 != -999);
		System.out.println("Fim!!!");
		
		entrada.close();
	}
	

}
