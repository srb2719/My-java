class Outer
{
	int outer_x = 100;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}

	private class Inner
	{
		int y = 10;
		void display()
		{
			System.out.println("Display: outer_x = " + outer_x);
		}
	}

	void showy()
	{
		System.out.println(y);
	}
	//This will throw a error as y is local to class Inner and not declared in the class Outer. Calling it here will throw an error
}

public class InnerClass
{
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.test();	
	}
}