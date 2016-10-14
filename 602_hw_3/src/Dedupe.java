import java.util.ArrayList;

public class Dedupe
{

	public static void main(String[] args)
	{
		Integer i1,i2,i3,i4,i5;
		// StdOut.println ("Enter integers");
		
		i1 = StdIn.readInt();
		i2 = StdIn.readInt();
		StdOut.println (i1 + " " + i2);
		
		ArrayList<Integer> list1 = new ArrayList<Integer> (); // create a new empty ArrayList

		ArrayList<Integer> list2 = new ArrayList<Integer> (); // create a new empty ArrayList
		
		ArrayList<Integer> res;
		
		res = union(list1,list2);
		
		// print out res as requested

	}
	
	public static ArrayList<Integer> union (ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		ArrayList<Integer> result = new ArrayList<Integer> (); // create a new empty ArrayList
		
		for (Integer elt : list1) // iterator over ArrayList
		{
			// add elt to result: 
			result.add(elt);
		}
		
//		for (int i=0; i < list1.size(); i++)
//		{
//			list1.get(i); // refers to same element as in elt above..
//		}
		
		return result;
		
	}

}
