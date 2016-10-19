package p11_17;

public class P11_17
{
	public static void main(String[] args)
	{

	}
}

/*

Given the following code, find the compile error.

A. m(new GraduateStudent()) causes an error
This is incorrect because GraduateStudent extends Student, which means Student is the
parent of GraduateStudent so through polymorphism and inheritance, this is legal
B. m(new Student()) causes an error
This is incorrect because m is looking for argument type of Student
C. m(new Person()) causes an error
This is correct because m is looking for argument type of Student, but Person does not
extend Student and thus is not applicable here
D. m(new Object()) causes an error
This is correct because Student is the subclass of Object and you cannot use polymorphism
to go from child to parent

*/

//class Test
//{
//	public static void main(String[] args)
//	{
//		m(new GraduateStudent());
//		m(new Student());
//		m(new Person());
//		m(new Object());
//	}
//
//	public static void m(Student x)
//	{
//		System.out.println(x.toString());
//	}
//}
//
//class GraduateStudent extends Student
//{
//}
//
//class Student extends Person
//{
//	@Override
//	public String toString()
//	{
//		return "Student";
//	}
//}
//
//class Person extends Object
//{
//	@Override
//	public String toString()
//	{
//		return "Person";
//	}
//}
