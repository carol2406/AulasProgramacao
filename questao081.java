import java.util.Scanner;

public class questao081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("inrome um valor");
		int valor1 = sc.nextInt();
		
		if ((valor1 > 100) && (valor1 < 200))    {
			System.out.println("esta no intervalo");
		} else {
			System.out.println("fora do intevalo");
		}
	}

}