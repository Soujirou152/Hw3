package p11_13;

public class P11_13
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
This is correct because the constructor of A is called and this statement is printed, 
but so also should B's statement be printed
C. The constructor of class A is called and it displays "i from A is 40".
This is not right because the setI method in B overrides A's setI
D. The constructor of class A is called and it displays "i from A is 60".
This is not correct because the i from A is 7 since A's setI is never called
but B's setI is called and i from B should be 60

*/

//class Test
//{
//	public static void main(String[] args)
//	{
//		new B();
//	}
//}
//
//class A
//{
//	int i = 7;
//
//	public A()
//	{
//		System.out.println("i from A is " + i);
//	}
//
//	public void setI(int i)
//	{
//		this.i = 2 * i;
//	}
//}
//
//class B extends A
//{
//	public B()
//	{
//		setI(20);
//		System.out.println("i from B is " + i);
//	}
//
//	@Override
//	public void setI(int i)
//	{
//		this.i = 3 * i;
//	}
//}
