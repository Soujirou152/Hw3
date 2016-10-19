package p11_19;

public class P11_19
{
	public static void main(String[] args)
	{

	}
}

/*
What is the output of the following code?

A. Person Person
This is correct because Student's getInfo is private and does not override Person's getInfo
so when printPerson is called, the JVM only finds Person's getinfo
B. Person Student
This is incorrect because Student's getInfo is never found
C. Student Student
This is incorrect because Person's getInfo is found, not Student's.
D. Student Person
This is incorrect for same reason as C

*/

//class Test
//{
//	public static void main(String[] args)
//	{
//		new Person().printPerson();
//		new Student().printPerson();
//	}
//}
//
//class Student extends Person
//{
//	private String getInfo()
//	{
//		return "Student";
//	}
//}
//
//class Person
//{
//	private String getInfo()
//	{
//		return "Person";
//	}
//
//	public void printPerson()
//	{
//		System.out.println(getInfo());
//	}
//}
