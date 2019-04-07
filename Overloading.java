class AreaOfObjects
{
	void area(int a)
	{
		int area = a*a;
		System.out.println("The area of the square is: " + area);
	}

	void area(int a, int b)
	{
		int area = a*b;
		System.out.println("The area of the reactangle is: " + area);
	}
}

public class Overloading 
{
	public static void main(String[] args) 
	{
		AreaOfObjects obj = new AreaOfObjects();
		obj.area(10);
		obj.area(10,15);	
	}
}