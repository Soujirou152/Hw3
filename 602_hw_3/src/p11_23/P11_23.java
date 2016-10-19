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
 * A. c3 is cast into c2 successfully. 
 * This is incorrect because you get a runtime error because C2 and and C3 sibling classes
 * B. You will get a runtime error because you cannot cast objects from sibling classes.
 * This is correct 
 * C. You will get a runtime error because the Java runtime system cannot perform multiple casting in nested form.
 * This is incorrect because Java runtime system is able to do multiple cast in nested form 
 * D. The statement is correct.
 * This is incorrect
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
