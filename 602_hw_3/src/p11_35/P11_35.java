package p11_35;

public class P11_35
{
	public static void main(String[] args)
	{

	}
}

/*
Analyze the following code.

A. Program 1 displays true and Program 2 displays true
This is correct since in Program 1, a1 and a2 are casted as A, and 
have same value. Program 2 displays true because a1 and a2 
are initialized with A2 and new A2(), checking the contents of the 
x's will be the same
B. Program 1 displays false and Program 2 displays true
This is incorrect because Program 1 displays true for reason given in A
C. Program 1 displays true and Program 2 displays false
This is incorrect because program 2 displays true in reason given in A
D. Program 1 displays false and Program 2 displays false
This is incorrect

*/

// Program 1
class Test
{
	public static void main(String[] args)
	{
		Object a1 = new A();
		Object a2 = new A();
		System.out.println(((A) a1).equals((A) a2));
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

// Program 2
class Test2
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
