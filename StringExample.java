import java.util.Scanner;
public class StringExample
{
	public static void main(String[] args) 
	{
		char [] a = {'c', 'o', 'n', 'g', 'r', 'a', 't', 's'};
		byte [] b = {82, 65, 86, 73, 75, 65, 78, 84};

	    String s1 = new String (a); System.out.println(s1);

        String s2 = new String (a, 1,5); System.out.println(s2);

		String s3 = new String (s1); System.out.println(s3);

		String s4 = new String (b); System.out.println(s4);

		String s5 = new String (b, 4, 3); System.out.println(s5);

	}
}
