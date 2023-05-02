import java.util.Scanner;

public class Triangulo1 {

	public static void main(String[] args) {
    
		
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();	
		Triangulo y = new Triangulo();
		System.out.println("digite os lados do triangulo X:  ");
		x.x1 = sc.nextDouble();
		x.x2 = sc.nextDouble();
		x.x3 = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y:");
		y.x1 = sc.nextDouble();
		y.x2 = sc.nextDouble();
		y.x3 = sc.nextDouble();
		
		double p1= (x.x1 + x.x2 + x.x3) /2;
		
		double p2 = (y.x1 + y.x2 + y.x3)/2;
		
		double AreaX = Math.sqrt(p1* (p1 - x.x1)*(p1 - x.x2)*(p1 - x.x3));
		double AreaY = Math.sqrt(p2 *(p2 - y.x1)*(p2 - y.x2)*(p2 - y.x3));
		
		if(AreaX > AreaY) {
			
			System.out.println("Triangulo X e maior");
			
		}else {
			
			System.out.println("Triangulo Y e maior");
			
		}
		
		sc.close();
	}}
	
	
	
	
	
	
	
	
	