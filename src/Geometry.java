import java.util.Scanner;

public class Geometry{
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.collectData();
		c.Calculate();
		c.Display();
		System.out.println("--------------------");
		Square s=new Square();
		s.collectData();
		s.Calculate();
		s.Display();
		System.out.println("---------------------");
		Rectangle r=new Rectangle();
		r.collectData();
		r.Calculate();
		r.Display();
	 
}

}
