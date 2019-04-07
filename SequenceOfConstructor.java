class Parent
{
	Parent()
	{
		System.out.println("You are inside parent class");
	}
}
class child extends Parent
{
	child()
	{
		System.out.println("You are inside child class");
	}
}

class child2 extends child
{
	child2()
	{
		System.out.println("You are inside child2 class");
	}

	public static void main(String[] args) 
	{
		child2 obj = new child2();	
	}
}