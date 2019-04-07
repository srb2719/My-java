interface A
{
	void display();
}

interface B
{
	void display();
}

class Abc implements A, B
{
	public void display()
	{
		System.out.println("Hello");
	}

	public static void main(String...args)
	{
		Abc obj = new Abc();
		obj.display();	
	}
}