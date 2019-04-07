import java.util.Scanner;
@FunctionalInterface
interface calci 
{
	void method(int a, int  b);
}

public class calculator implements calci
{
	public static void main(String[] args) 
	{
		calci add = (int a, int b) -> {return (a+b)};
		calci sub = (int a, int b) -> {return (a-b)};
		calci mul = (int a, int b) -> {return (a*b)};
		calci div = (int a, int b) -> {return (a/b)};
		Scanner in = new Scanner(System.in);
		int x, y;
		String c;
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Please enter the method you want to perform");
		z = in.next();
		Switch(z)
		{
			Case "add":
			{
				add.calci(x,y);
			}
			Case "sub":
			{
				add.calci(x,y);
			}
			Case "mul":
			{
				add.calci(x,y);
			}
			Case "div":
			{
				add.calci(x,y);
			}
		}
	}
}