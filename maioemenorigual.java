import java.util.Scanner;

public class maioemenorigual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("infome um valor");
		int valor1 = sc.nextInt();
		
		System.out.println("infome um valor");
		int valor2 = sc.nextInt();
		// maior menor igual
		if (valor1 > valor2) {
			System.out.println("valor1 é maior que valor2");
		} else {
			System.out.println("valor2 é menor que valor1");
		}
	}

}
