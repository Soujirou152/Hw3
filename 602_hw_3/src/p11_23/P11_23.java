package p11_23;

public class P11_23
{
	public static void main(String[] args)
	{
		C2 c2 = new C2();
		C3 c3 = new C3();

		// Analyze the following statement:

		c2 = (C2) ((C1) c3);

	}
}

/*
 * Given the following classes and their objects:
 * 
 * A. c3 is cast into c2 successfully. B. You will get a runtime error because
 * you cannot cast objects from sibling classes. C. You will get a runtime error
 * because the Java runtime system cannot perform multiple casting in nested
 * form. D. The statement is correct.
 * 
 */

class C1
{
};

class C2 extends C1
{
};

class C3 extends C1
{
};
