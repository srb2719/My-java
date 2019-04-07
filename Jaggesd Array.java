import java.util.Scanner;
class Jagged{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int sum = 0;
		int a[] = new int[20];
		int arr[][] = new int[row][];
		System.out.println("Enter the no. of columns for each row");
		for(int i=0; i<row; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<row; i++)
		{
			arr[i] = new int[a[i]];
		}
		System.out.println("Enter the values with first row first col then 1st row second column and in this manner");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<a[i]; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the column for which you want to find sum");
		int add = sc.nextInt();
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<a[i]; j++)
			{
				if(j==add-1)
				{
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("The sum is :"+ sum);
	}
}