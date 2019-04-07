import java.util.Scanner;
class Name
{
	String na;
	Name(String n)
	{
		na = n;
	}

	public void display()
	{
		System.out.println("My name is : " + na);
	}
}

class main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String inp;
		inp = in.next();
		Name obj = new Name(inp);
		obj.display();	
	}
}