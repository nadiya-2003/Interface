import java.util.Scanner;
public class Circle  implements Shapes{
double radius;
static double  pi=3.14;
double area;
@Override
public void collectData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	radius=sc.nextDouble();
}

@Override
public void Calculate() {
	// TODO Auto-generated method stub
	area=pi*radius*radius;
}

@Override
public void Display() {
	// TODO Auto-generated method stub
	System.out.println("Area of the circle is:"+area);
}
}
