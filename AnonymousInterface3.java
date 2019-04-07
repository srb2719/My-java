interface Message
{
	void msg();
}

public class AnonymousInterface3
{
	void message(Message object)
	{
		System.out.println("Passing the argument as reference of Message and taking what is inside the obj.. YO!!");
	}


	public static void main(String[] args) 
	{
		AnonymousInterface3 ob = new AnonymousInterface3();

		ob.message(new Message()
		{
			public void msg(){};
		});
	}
}