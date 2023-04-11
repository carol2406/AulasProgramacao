import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("infome a idade de joão");
		int idadejoao = sc.nextInt();
		System.out.println("informe a idade de jose");
		int idadejosé = sc.nextInt();
		System.out.println("informe a idade de maria");
		int idademaria = sc.nextInt();
		
		if ((idadejoao < idadejosé) && (idadejoao < idademaria)) {
			System.out.println("joão");
		} else {
			if ((idadejosé < idadejoao) && (idadejosé < idademaria)){
				System.out.println("jose");
			} else {
					System.out.println("maria");
				}
			}
}
		
		
	}

