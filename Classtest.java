import java.util.Scanner;
@FunctionalInterface
interface Demo
{
	boolean checkString(String str);
}

class Input implements Demo
{
	String getInput()
	{
		Scanner in = new Scanner(System.in);
		String a;
		a = in.next();
		return a;
	}
	public boolean checkString(String str)
	{
		char ch;
		int len = str.length(), count=0;
		for(int i=0; i<len; i++)
		{
			ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				count++;
			}
			else
			{
				continue;
			}
		}
		if(count == len)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Input obj = new Input();
		System.out.println(obj.checkString(obj.getInput()));
	}
}