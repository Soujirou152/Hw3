import java.util.ArrayList;

public class Dedupe
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer> (); // create a new empty ArrayList

		ArrayList<Integer> list2 = new ArrayList<Integer> (); // create a new empty ArrayList
		
		Integer i1,i2,i3,i4,i5;
		 StdOut.print ("Enter five integers for list1: ");
		
		i1 = StdIn.readInt();
		list1.add(i1);
		i2 = StdIn.readInt();
		list1.add(i2);
		i3 = StdIn.readInt();
		list1.add(i3);
		i4 = StdIn.readInt();
		list1.add(i4);
		i5 = StdIn.readInt();
		list1.add(i5);
		//StdOut.println (i1 + " " + i2);
		
		 StdOut.print ("Enter five integers for list2: ");

		 
			i1 = StdIn.readInt();
			list2.add(i1);
			i2 = StdIn.readInt();
			list2.add(i2);
			i3 = StdIn.readInt();
			list2.add(i3);
			i4 = StdIn.readInt();
			list2.add(i4);
			i5 = StdIn.readInt();
			list2.add(i5);
				
		
		ArrayList<Integer> res;
		
		res = union(list1,list2);
		
		StdOut.print("The combined list is ");
		for(Integer iterator : res){
			StdOut.print(iterator + " ");
		}
		
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
		
		for (int i=0; i < list2.size(); i++)
		{
			int x = list2.get(i); // refers to same element as in elt above..
			result.add(x);
		}
		
		return result;
		
	}

}
