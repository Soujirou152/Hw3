package p11_10;

public class P11_10 {
	public static void main(String[] args) {

	}
}

/*
 * The getValue() method is overridden in two ways. Which one is correct?
 * 
 * A. I 
 * Is not correct because to override a superclass' method, the subclass
 * method has to return the same value has its superclass. In this case
 * a.getValue() should return String just like b.getValue(), but this is not the
 * case here 
 * B. II 
 * Is correct because the subclass method returns same type of value as superclass
 * In example, 
 * This is the only correct answer listed here
 * C. Both I and II
 * Is not correct because it includes I
 * D. Neither
 * Is not correct because II is correct
 * 
 */

// I:
// class Test
// {
// public static void main(String[] args)
// {
// A a = new A();
// System.out.println(a.getValue());
// }
//
// }
//
// class B
// {
// public String getValue()
// {
// return "Any object";
// }
//
// }
//
// class A extends B
// {
// public Object getValue()
// {
// return "A string";
// }
//
// }
//
//// II:
//
// class Test2
// {
// public static void main(String[] args)
// {
// A2 a = new A2();
// System.out.println(a.getValue());
// }
//
// }
//
// class B2
// {
// public Object getValue()
// {
// return "Any object";
// }
//
// }
//
// class A2 extends B2
// {
// public String getValue()
// {
// return "A string";
// }
// }
