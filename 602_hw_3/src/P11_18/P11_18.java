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
This is incorrect because class Student has a getInfo method that should override Person's
getInfo method when printPerson is called
B. Person Student 
This is correct because each class has a getInfo method that returns a string
and the subclass, Student, overrides Person's getInfo method so its own getInfo
method is called and found first when the JVM is executing the printPerson call
C. Student Student 
This is incorrect because Person's getInfo method should only output first and show Person,
not Student
D. Student Person
This is incorrect because of the same reason as C

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
