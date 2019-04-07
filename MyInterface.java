interface A
{
	void method1();
	void method2();
}

interface B extends A
{
	void method3();
}

class Methods implements B
{
	public void method1()
	{
		System.out.println("Hey there!, I am method 1");
	}
	public void method2()
	{
		System.out.println("Hey there!, I am method 2");
	}
	public void method3()
	{
		System.out.println("Hey there!, I am method 3");
	}
}

public class MyInterface
{
	public static void main(String[] args)
	{
		Methods obj = new Methods();
		obj.method1();
		obj.method2();
		obj.method3();		
	}
}