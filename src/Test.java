
public class Test {

	public static void main(String[] args) {
		//Calculator1 c1=new Calculator1();//error rule no 4
		Calculator1 c2;
		//rule no-5
		Calculator1 c3=new Calculator1()
	{
		@Override
		public void add() {
				System.out.println("Inside add method of calculator 1");
		}
		@Override
		public void sub() {
			System.out.println("Inside sub method of calculator 1");
		}
		//rule-no 13
	};
	c3.add();
	c3.sub();
	}
}
