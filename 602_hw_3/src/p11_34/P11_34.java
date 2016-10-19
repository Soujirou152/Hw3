package p11_34;

public class P11_34
{
	public static void main(String[] args)
	{

	}
}

/*
Analyze the following code.

A. Program 1 displays true and Program 2 displays true
This is incorrect since Program 1 displays false because a1 and a2 are initialized as
Objects to new A(), the x's are not the same
B. Program 1 displays false and Program 2 displays true
This is correct
C. Program 1 displays true and Program 2 displays false
This is incorrect because Program 2 displays true because a1 and a2 are initialized with A2 and
new A2(), checking the contents of the x's will be the same
D. Program 1 displays false and Program 2 displays false
This is incorrect for same reason as C

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

	public boolean equals(A a)
	{
		return this.x == a.x;
	}
}

// Program 2:
class Tests
{
	public static void main(String[] args)
	{
		A2 a1 = new A2();
		A2 a2 = new A2();
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
