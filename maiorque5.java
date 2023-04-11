import java.awt.event.WindowStateListener;
import java.util.Scanner;

public class maiorque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("informe um valor");
		int x1 = sc.nextInt();
		int maior = x1;
		int menor = x1;

		int n = 1;

		while (n <= 4) {
			System.out.println("informe um valor");
			int x2 = sc.nextInt();

			if (x2 > maior) {
				maior = x2;
			}
			if (x2 < menor) {
			menor = x2;
			}
			
			n++;
		}
		
		System.out.println("maior" + maior);
		System.out.println("menor" + menor);

	}
}
