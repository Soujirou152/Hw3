package p11_9;

public class P11_9
{
	public static void main(String[] args)
	{

	}
}

/*
Analyze the following code:

A. The program has a compile error, because m is overridden with a different signature in B.
This is incorrect because m is overloaded in B, not overidden
B. The program has a compile error, because b.m(5) cannot be invoked since the method m(int) is hidden in B.
m(int) is not hidden in B, instead it is inherited from A to B
C. The program has a runtime error on b.i, because i is not accessible from b.
This is incorrect because b inherits A's m method and i is accessible from b
D. The method m is not overridden in B. B inherits the method m from A and defines an overloaded method m in B.
This is correct and is the answer to the question with the reasoning in the answer.

*/

class Test
{
	public static void main(String[] args)
	{
		B b = new B();
		b.m(5);
		System.out.println("i is " + b.i);
	}
}

class A
{
	int i;

	public void m(int i)
	{
		this.i = i;
	}
}

class B extends A
{
	public void m(String s)
	{
	}
}
