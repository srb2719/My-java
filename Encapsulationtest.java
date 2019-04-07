class Encapsulate
{
	private int roll, age;
	private String name;

	public int getroll()
	{
		return roll;
	}

	public int getage()
	{
		return age;
	}

	public String getname()
	{
		return name;
	}

	public void setroll(int new_roll)
	{
		roll = new_roll;
	}

	public void setage(int new_age)
	{
		age = new_age;
	}

	public void setname(String new_name)
	{
		name = new_name;
	}
}

public class Encapsulationtest
{
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();

		obj.setroll(07);
		obj.setage(20);
		obj.setname("Sourabh");


		System.out.println("Name : " + obj.getname());
		System.out.println("Age : " + obj.getage());
		System.out.println("Roll no : " + obj.getroll());
	}
}