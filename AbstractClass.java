abstract class Shape
{
	Shape()
	{
		System.out.println("Shape constructor called");
	}

	public abstract double area(int a);
	public abstract double area(int a, int b);
}

class Rectangle extends Shape
{
	public double area(int a, int b)
	{
		int area = a*b;
		System.out.println("The area of the rectangle is: " + area);
	}
}

class Square extends Shape
{
	public double area(int a)
	{
		int area = a*a;
		System.out.println("The area of the sqaure is: " + area);
	}
}

public class AbstractClass
{
	public static void main(String[] args) 
	{
		Square obj1 = new Square();
		obj1.area(5);
		Rectangle obj2 = new Rectangle();
		obj2.area(5,10);	
	}
}