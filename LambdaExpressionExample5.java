interface Sayable
{
	public String say(String name);
}



public class LambdaExpressionExample5
{
	public static void main(String[] args) 
	{
		//Lambda expression with single parameter
		Sayable s1 = (name) ->
		{
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		//You can omit funtion parentheses
		Sayable s2 = name ->
		{
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	}
}