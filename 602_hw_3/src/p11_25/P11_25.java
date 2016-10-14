package p11_25;

public class P11_25
{
	public static void main(String[] args)
	{

	}
}
/*
Analyze the following code:

A. When assigning s to o in Object o = s, a new object is created.
B. When casting o to s in String d = (String)o, a new object is created.
C. When casting o to s in String d = (String)o, the contents of o is changed.
D. s, o, and d reference the same String object.

*/

class Test
{
	public static void main(String[] args)
	{
		String s = new String("Welcome to Java");
		Object o = s;
		String d = (String) o;
	}
}
