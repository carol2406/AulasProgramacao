import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o sexo");
		String sexo = entrada.next().toUpperCase();
		
		
		switch (sexo) {
		case "M":
		System.out.println("masculino");
		break;
		case "F":
		System.out.println("feminino");
		break;
		
		default:
			System.out.println("sexo invalido");
			
		}

	}

}
