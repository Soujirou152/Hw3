package p11_24;

public class P11_24
{
	public static void main(String[] args)
	{
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		C4 c4 = new C4();
		
		System.out.println(c1 instanceof C1 );
		System.out.println(c2 instanceof C1  );
		System.out.println(c3 instanceof C1);
		//System.out.println(c4 instanceof C2 );
	}
}

/*
Given the following code:

Which of the following expressions evaluates to false? 
A. c1 instanceof C1
This evaluates to true since C1 is insance of C1 
B. c2 instanceof C1 
This evaluates to true since C2 extends C1
C. c3 instanceof C1 
This evaluates to true since C3 extends C1
D. c4 instanceof C2
This evaluates to false so  is correct, since C4 does not extend C2

*/

class C1
{
}

class C2 extends C1
{
}

class C3 extends C2
{
}

class C4 extends C1
{
}
