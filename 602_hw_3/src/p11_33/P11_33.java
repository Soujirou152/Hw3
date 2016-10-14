package p11_33;

public class P11_33
{
	public static void main(String[] args)
	{

	}
}
/*
Analyze the following code.

A. Program 1 displays true and Program 2 displays true
B. Program 1 displays false and Program 2 displays true
C. Program 1 displays true and Program 2 displays false
D. Program 1 displays false and Program 2 displays false

*/
// Program 1:
class Test
{
	public static void main(String[] args)
	{
		Object a1 = new A();
		Object a2 = new A();
		System.out.println(a1.equals(a2));
	}
}

class A
{
	int x;

	public boolean equals(Object a)
	{
		return this.x == ((A) a).x;
	}
}

// Program 2:
class Test2
{
	public static void main(String[] args)
	{
		Object a1 = new A2();
		Object a2 = new A2();
		System.out.println(a1.equals(a2));
	}
}

class A2
{
	int x;

	public boolean equals(A2 a)
	{
		return this.x == a.x;
	}
}
