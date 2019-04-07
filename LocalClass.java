class Simple
{
	private int data = 30;
	void sayHello()
	{
		System.out.println("Hello");
	}

	void display()
	{
		int b = 40;
		class Local
		{
			void msg()
			{
				sayHello();
				System.out.println("Result is : " + (data+b));
			}
		}
		Local obj = new Local();
		obj.msg();
	}
}

public class LocalClass 
{
	public static void main(String[] args) 
	{
		Simple obj2 = new Simple();
		obj2.display();	
	}
}