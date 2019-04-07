import java.util.Scanner;
public class DecapitilizeString
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input;
		input = in.nextLine();
		char c[] = input.toCharArray();
		for(int i=0; i<input.length(); i++)
		{
			if(c[i]>=60 && c[i]<=90)
			{
				c[i] += 32;
			}
		}	
		String s = new String(c);
		System.out.println(s);

		String s2 = "KAMAL";
	     char b[] = new char [10];	
	     b[0] = 'N';	 b[1] = 'E';
	     b[2] = 'E';     b[3] = 'L';
	     b[4]='o';
	     s2.getChars(0, 4, b, 5);
	     System.out.println(b);

	}
}