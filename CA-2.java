import java.util.Scanner;
abstract class StringTest
{
	Scanner in = new Scanner(System.in);
	String s;
	public String readString()
	{
		System.out.println("Please enter the String");
		s = in.nextLine();
		return s;
	}

	public abstract int countCharacter(String s, char c);
}

class Mystring extends StringTest
{
	public int countCharacter(String s, char c)
	{
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				count++;
			}
			else
			{
				continue;
			}
		}
		return count;
	}

	public String readString2()
	{
		String z;
		Mystring obj2 =  new Mystring();
		z = obj2.readString();
		int len = z.length(); String k2="";
		for(int i=len-1; i>=0; i--)
		{
			k2 = k2 + z.charAt(i);
		}
		return k2;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Mystring obj = new Mystring();
		int c1; char k; String t;
		System.out.println("Please enter the character you want to check in the String");
		t = in.next();
		k = t.charAt(0);
		c1 = obj.countCharacter(obj.readString(), k);
		System.out.println("The no. of times is : " + c1);
		System.out.println("The reverse of the string is : " + obj.readString2());
	}
}