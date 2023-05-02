
public class Retangulo {

	public double width;
	public double heigth;
	
	public double area() {
		double area = this.width * this.heigth;
		return area;
	}
	public double perimetro() {
		double p = 2 * (this.width * this.heigth);
		return p;
	}
	public double diagonal() {
		double d = Math.sqrt(this.width * this.width) + (this.heigth * this.heigth);
		return d;		
	}
}
