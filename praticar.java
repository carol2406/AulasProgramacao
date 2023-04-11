import java.util.Scanner;

public class praticar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sabor desejado: (m/c) ");
		String sabor = sc.next();
		System.out.println("Quantidade de bolas? ");
		int bolas = sc.nextInt();
		
		if (sabor.equalsIgnoreCase("m")) {
			System.out.println("sem desconto");
		} 
		else if (sabor.equalsIgnoreCase("c")) {
			
			if (bolas >= 3) {
				System.out.println("desconto de 10%");
			}
			else {
				System.out.println("deconto de 5%");
			}
		}
		else {
			System.out.println("sabor invalido");
		}
	}

}
