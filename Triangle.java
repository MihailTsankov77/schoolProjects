package Exercise;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		super(3);
	}
	
	public Triangle(double s1, double s2, double s3,  String color, boolean isFill) {
		super(3, color, isFill);
		this.setSide1(s1);
		this.setSide2(s2);
		this.setSide3(s3);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double p = this.getPerimeter()/2;
		return Math.sqrt( p*(p - this.side1)*(p - this.side2)*(p - this.side3) );
	}

	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String printRectangle() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;

	}

}
