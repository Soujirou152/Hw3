package p11_6;

public class P11_6
{

	public static void main(String[] args)
	{

	}

}

/*
 * What is the output of running class C?
 * 
 * A. Nothing displayed 
 * This is incorrect because the program compiles and displays something
 * B. "The default constructor of B is invoked" 
 * this is incorrect because this is not the only thing it displays, but displays something before this
 * C."The default constructor of A is invoked" followed by "The default constructor of B is invoked"
 * This is correct because B extends A, is a subclass of A, and A's subclass is invoked  implicitly, it is the first thing called.
 * D."The default constructor of B is invoked" followed by "The default constructor of A is invoked" 
 * This is incorrect because the outputs are switched from what really is displayed
 * E."The default constructor of A is invoked"
 * This is only partially correct, should also display B's string msg after A's is.
 */

class A
{
	public A()
	{
		System.out.println("The default constructor of A is invoked");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("The default constructor of B is invoked");
	}
}

class C
{
	public static void main(String[] args)
	{
		B b = new B();
	}
}
