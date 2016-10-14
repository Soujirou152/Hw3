package P11_18;

public class P11_18
{
	public static void main(String[] args)
	{

	}
}

/*
What is the output of the following code?

A. Person Person 
B. Person Student 
C. Student Student 
D. Student Person

*/

class Test
{
	public static void main(String[] args)
	{
		new Person().printPerson();
		new Student().printPerson();
	}
}

class Student extends Person
{
	@Override
	public String getInfo()
	{
		return "Student";
	}
}

class Person
{
	public String getInfo()
	{
		return "Person";
	}

	public void printPerson()
	{
		System.out.println(getInfo());
	}
}
