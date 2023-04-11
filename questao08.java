import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inrome um valor");
		int valor1 = sc.nextInt();
				
				if (valor1 > 100) {
					if (valor1 < 200) {
						System.out.println("Está no intevalo!!!"); 
					} else {
						System.out.println("Fora do intevalo!!!"); 
					}
				} else {
					    System.out.println("Fora do intevalo!!!"); 
				}
	}

}
