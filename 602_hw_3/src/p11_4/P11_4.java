package p11_4;

public class P11_4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

/*
Analyze the following code:

A. The program has a compile error because A does not have a default constructor.
	Wrong, because Java adds a no-arg default constructor to A
B. The program has a compile error because the default constructor of A invokes the default constructor of B, but B does not have a default constructor.
	Yes, this is the problem..
C. The program would compile fine if you add the following constructor into A: A(String s) { }
	Wrong, still need a 
D. The program would compile fine if you add the following constructor into A: A(String s) { super(s); }
	Yes, this fixes it because...

*/

class A extends B
{
	A(String s) { super(s); }
}

class B
{
	public B(String s)
	{
	}
}
