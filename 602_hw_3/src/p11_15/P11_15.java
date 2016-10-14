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
 B. When executing System.out.println(a1), the toString() method in the Object class is invoked.
 C. When executing System.out.println(a2), the toString() method in the Object class is invoked.
 D. When executing System.out.println(a1), the toString() method in the A class is invoked.
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
