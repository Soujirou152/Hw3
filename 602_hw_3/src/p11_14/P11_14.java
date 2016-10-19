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
This is not correct since SetI is called
C. The constructor of class A is called and it displays "i from A is 40".
This is not correct because even though SetI(20) is called in A, the JVM searches for a SetI method and arrives at the subclass B's SetI
D. The constructor of class A is called and it displays "i from A is 60".
This is correct, because this is referring to B's setI class the JVM finds after the new instance of B is called and setI is called in A
but found B's setI first

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
