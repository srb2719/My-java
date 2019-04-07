interface Message
{
	void msg();
}

public class AnonymousInterface2
{
	void message(Message object)
	{
		System.out.println("Passing the argument as reference of Message");
	}


	public static void main(String[] args) 
	{
		Message obj = new Message()
		{
			public void msg()
			{
				System.out.println("Hello");
			}
		};
		AnonymousInterface2 ob = new AnonymousInterface2();

		ob.message(obj);
		obj.msg();
	}
}