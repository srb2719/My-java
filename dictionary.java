import java.util.Scanner;
public class dictionary 
{
	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
			int a;
			String arr[] = new String[10];
			System.out.println("Please enter the 10 words you want to arrange");
			for(a=0; a<10; a++)
			{
				arr[a] = in.next();
			}

			String max = "";
			for(a=0; a<10; a++)
			{
				if(arr[a].length()>max.length())
				{
					max = arr[a].length();
				}
			}
			System.out.println(max);
	}
}