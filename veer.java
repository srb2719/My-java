import java.util.Scanner;
abstract class A //Parent class
{
	void demo() //non-abstract method demo
	{
		int x = 10; //integer value x intialized
		System.out.println("I am inside A that is abstract parent class and my value is x = " + x);
	}
}
interface B
{
	default void demo() //default method
	{
		double x = 20;
		System.out.println("I am inside B that is interface and my value is x = " + x);
	}
}

class Test extends A implements B
{
	public void demo()
	{
		super.demo(); //Invoking parent demo function
		B.super.demo(); //invoiking  interface demo function
		System.out.println("I am inside the child class and overriden method");
	}

	public static void main(String[] args) 
	{
			Test obj = new Test();
			obj.demo();
	}
}