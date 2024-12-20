
public interface Calculator1 {
int a=10;
void add();
void sub();
}
//interface Calculator2 implements Calculator
//{
//	//error rule no 7
//}
interface Calculator3 extends Calculator1
{
	//int a=10;//can be accessed here also
	//void add();//can be accessed here also
	//void sub();//can be accessed here also
	void mull(); //rule no8
	void div();
}
interface Calculator4
{
	void add1();//rule no9
	void add2();//rule no9
}

class SampleCode1 implements Calculator1
{
//Rule no1
	@Override
	public void add() {
	System.out.println("Inside add method of Sample Code1");
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code1");
	}
	
}


class SampleCode2 implements Calculator1
{
//Rule no1
	@Override
	public void add() {
	System.out.println("Inside add method of Sample Code2");
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code2");
	}
	
}

class SampleCode3 implements Calculator1,Calculator3
{							//rule no 6
	@Override
	public void mull() {
		System.out.println("Inside mul method of Sample Code3");
		
	}
	@Override
	public void div() {
		System.out.println("Inside div method of Sample Code3");
		
	}
	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code3");
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code3");
	}
}
interface Calculator5
{
	//Ruleno11:Tagged Interface
}

class SampleCode4
{
	void display()
	{
		System.out.println("Inside Display method");
	}
}
class Samplecode5 extends SampleCode4 implements Calculator1
{
//Rule no 12
	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code5");
		
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code5");	
	}	
}
interface Calculator6
{
	void addition();
	void subtraction();
	//rule no-14
	default void multiplication()
	{
		System.out.println("Inside mul method of Sample Calculator6");	
	}
	static void division()
	{
		System.out.println("Inside div method of Sample Calculator6");	
	}
}
abstract class SampleCode6 implements Calculator6
{
	//rule no-15
	@Override
	public void addition() {
		System.out.println("Inside add method of Sample Code6");
}
}