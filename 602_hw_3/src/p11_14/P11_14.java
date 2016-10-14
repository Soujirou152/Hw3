package p11_14;

public class P11_14
{
	public static void main(String[] args)
	{

	}
}

/*

Analyze the following code:

A. The constructor of class A is not called.
This is not correct since B extends A, the constructor of A is invoked
B. The constructor of class A is called and it displays "i from A is 7".
This is not correct since A's SetI is called and sets I to 20 * 2 which is forty
C. The constructor of class A is called and it displays "i from A is 40".
This is correct
D. The constructor of class A is called and it displays "i from A is 60".
This is not correct, because this is referring to B's setI class that overrides A

*/

class Test
{
	public static void main(String[] args)
	{
		new B();
	}
}

class A
{
	int i = 7;

	public A()
	{
		setI(20);
		System.out.println("i from A is " + i);
	}

	public void setI(int i)
	{
		this.i = 2 * i;
	}
}

class B extends A
{
	public B()
	{
		// System.out.println("i from B is " + i);
	}

	@Override
	public void setI(int i)
	{
		this.i = 3 * i;
	}
}
