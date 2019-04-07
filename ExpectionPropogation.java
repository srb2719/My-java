import java.util.*;
class TestExceptionPropagation
{
	void m()
	{
		int data = 50/0;
	}

	void n()
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Throwable e)
		{
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) 
	{
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.p();
		System.out.println("Normal flow");	
	}
}