import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// se a soma forMaior ou igual a 20 add 10,
		// senao subtrai de 5

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um valor");
		int numero1 = entrada.nextInt();

		System.out.println("informe um valor");
		int numero2 = entrada.nextInt();
		
		int soma = numero1 + numero2;
		
		int valor = (soma >= 20) ? soma + 10 : soma - 5 ;
		System.out.println("o resultado será : " + valor);
		
		System.out.printf(" o resultado será %d", valor);
	}

}
