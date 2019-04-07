import java.util.Scanner;
class Parent
{
	int i, j;
	Parent()
	{
		System.out.println("You are inside Parent constructor");
	}

	void showij(int a,int b)
	{
		System.out.println("In parent function");
		System.out.println("i: " + a + " j: " + b);
	}
}

class child extends Parent
{
	int k;
	void showij(int a, int b)
	{
		System.out.println("In child function");
		System.out.println("i: " + a + " j: " + b);
	}

	void sum(int x, int y, int z)
	{
		System.out.println("Sum: "+ (i+j+k));
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		child obj = new child();
		obj.showij(i,j);
		obj.sum(i,j,k);
	}
}