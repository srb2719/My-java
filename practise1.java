import java.util.Scanner;
abstract class Person
{
	int age, mobile_no;
	String name;
	Person()
	{
		name = "Sourabh";
		age = 20;
		mobile_no = 799;	
	}
	public void display()
	{
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
		System.out.println("Your mobile_no is : " + mobile_no);
	}

	public abstract void designation(String de);
}

class Student extends Person
{
	Student()
	{
		super();
	}
	public void designation(String de)
	{
		System.out.println("Desgination" + de);
	}
}

class Employee extends Person
{
	Employee()
	{
		super();
	}
	public void designation(String de)
	{
		System.out.println("Designation : " + de);
	}
}

class main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String des, org;
		System.out.println("Enter your designation");
		des = in.next();
		System.out.println("Enter your organization");
		org = in.next();
		Student obj1 = new Student();
		Employee obj2 = new Employee();
		if(des == "student")
		{
			obj1.display();
			obj1.designation(des);
		}

		else
		{
			obj2.display();
			obj2.designation(des);
		}
	}
}