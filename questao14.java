import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("infome a idade de jo�o");
		int idadejoao = sc.nextInt();
		System.out.println("informe a idade de jose");
		int idadejos� = sc.nextInt();
		System.out.println("informe a idade de maria");
		int idademaria = sc.nextInt();
		
		if ((idadejoao < idadejos�) && (idadejoao < idademaria)) {
			System.out.println("jo�o");
		} else {
			if ((idadejos� < idadejoao) && (idadejos� < idademaria)){
				System.out.println("jose");
			} else {
					System.out.println("maria");
				}
			}
}
		
		
	}

