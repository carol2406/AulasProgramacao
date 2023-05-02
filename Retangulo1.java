import java.util.Scanner;

public class Retangulo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo ret = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a altura");
		ret.heigth = sc.nextDouble();
		System.out.println("digite a largura");
		ret.width = sc.nextDouble();
		
		System.out.println("A area " + ret.area());
		System.out.println("O perimetro " + ret.perimetro());
		System.out.println("A diagonal " + ret.diagonal());
	
		sc.close();
	}

}
