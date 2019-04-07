interface Drawable
{
	public void draw();
}

public class LambdaExpressionExample2
{
	public static void main(String[] args) 
	{
		int width = 10;	
		//without Lambda, Drawable implementation using anonymous class
		Drawable d = () -> {
			System.out.println("Drawing " + width);
		};
		d.draw();
	}
}