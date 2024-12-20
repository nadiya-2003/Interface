import java.util.Scanner;
public class Square implements Shapes {

	double side;
	double area;
	@Override
	public void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of squaree:");
		side=sc.nextDouble();
	
	}

	@Override
	public void Calculate() {
		area=side*side;
	}
	@Override
	public void Display() {
		System.out.println("Area of the square  is:"+area);
		
	}

}
