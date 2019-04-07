public class TryAndThrow
{
	static void validate(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Not valid");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
	}	

	public static void main(String[] args) 
	{
		validate(13);
		System.out.println("Rest of the code");	
	}
}
