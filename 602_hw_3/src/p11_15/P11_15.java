package p11_15;

public class P11_15
{

	public static void main(String[] args)
	{

	}

}

/*
Analyze the following code:

 A. The program cannot be compiled, because System.out.println(a1) is wrong and it should be replaced by System.out.println(a1.toString());
 this is incorrect because the program is compiled because the JVM automatically uses a1's toString method
 B. When executing System.out.println(a1), the toString() method in the Object class is invoked.
 This is incorrect because a1 is actually an instance of class A and has a toString method that is used
 C. When executing System.out.println(a2), the toString() method in the Object class is invoked.
 This is correct  because a2 is an instance of class Object and Object's toString method is called
 D. When executing System.out.println(a1), the toString() method in the A class is invoked.
 This is correct because a1 is an instance of class A and class A's toString method is called
*/

class Test
{
	public static void main(String[] args)
	{
		Object a1 = new A();
		Object a2 = new Object();
		System.out.println(a1);
		System.out.println(a2);
	}
}

class A
{
	int x;

	@Override
	public String toString()
	{
		return "A's x is " + x;
	}
}
