class Outer
{
	static int outer_x = 10; //static member
	int outer_y = 20; // non- static member
	private static int outer_private = 30;

	static class NestedClass
	{
		void display()
		{
			System.out.println("outer_x : " + outer_x);
			System.out.println("outer_private : " + outer_private);
			/*If you try to print outer_y which is non-static member
				Then you will get compile time error.
				Because in static class only static members can be accessed.*/
		}
	}
}

class DriverClass
{
	public static void main(String[] args) 
	{
		Outer.NestedClass nestedObject = new Outer.NestedClass();
		nestedObject.display();	
	}
}