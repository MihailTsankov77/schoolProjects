package Exercise;

import java.util.Scanner;

public class GeometricObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double a= sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		boolean fill = sc.nextInt()==1;
		
		String color = sc.nextLine();
		
		Triangle tr = new Triangle(a,b,c , color, fill);
		
		System.out.println(tr.getArea() + "\n"+ tr.getPerimeter() + "\n" + tr.getColor() + "\n" + tr.isFill());
	}

}
