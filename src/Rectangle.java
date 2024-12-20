import java.util.Scanner;
public class Rectangle  implements Shapes{
		double length;
		double breadth;
		double area;

	@Override
	public void collectData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	@Override
	public void Calculate() {
		area=length*breadth;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle  is:"+area);
	}
}
