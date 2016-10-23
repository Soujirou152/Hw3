package p11_5;

public class P11_5
{

	public static void main(String[] args)
	{

	}

}
/*
Analyze the following code:

A. The program does not compile because Test does not have a default constructor Test().
This is not correct because Test has an implicit default constructor 
B. The program has an implicit default constructor Test(), but it cannot be compiled, because its super class does not have a default constructor. The program would compile if the constructor in the class A were removed.
This is correct because then the only constructor in A would be default constructor which would be invoked implicitly from Test's default constructor
C. The program would compile if a default constructor A(){ } is added to class A explicitly.
This is correct because Test's implicit constructor can called the explicit A's default constructor
D. The program compiles, but it has a runtime error due to the conflict on the method name print.
This is not correct because there is no conflict in the method name print

*/
//
//class Test extends A
//{
//	public static void main(String[] args)
//	{
//		Test t = new Test();
//		t.print();
//	}
//}
//
//class A
//{
//	String s;
//	
//		
//	}
//
//	A(String s)
//	{
//		this.s = s;
//	}
//
//	public void print()
//	{
//		System.out.println(s);
//	}
//}
