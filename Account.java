import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("emter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; n++) {
		System.out.println("Tax payer # " + i + "data");
		
		System.out.println("individual or company???");
		char type = sc.next().charAt(0);
		
		System.out.println("nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Anual income: ");
		double income = sc.nextDouble();
		
		if (type == 'i') {
			System.out.println("Health expenditures: ");
			double heatlthExpenditures = sc.nextDouble();
			
			Individual individual = new Individual(nome, income,heatlthExpenditures);
			
			list.add(individual);
			
		} else {
				System.out.println("number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company (nome, income,numberOfEmployees));
				
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getNome() + ": $" + String.format("%.2f",tax));
			sum +=tax;
			
			
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f",sum));
		
		sc.close();
		
	}

}

