
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import org.testng.annotations.Test;

public class CollectionCourser 
{
	@Test
	public void m1()
	{
		Vector v=new Vector();
		v.add(4);
		v.add(9);
		v.add(14);
		ArrayList<Integer> ar =new ArrayList<Integer>();//<> used this to casting in to Integer type
		ar.add(15);
		ar.add(null);
		ar.add(null);//duplicate null is allowed 
		ar.add(16);
		ar.add(16);
		ar.add(17);
		ar.add(10);
		
		//three courser in collection framework 
		//1.Enumeration
		//it provides two method : 1.hasaMoreElements() 2.nextElements()
		//limitation : only can work with legacy class , it doesn't have remove operation
		//2.Iterator 	:it provides three method :1.next() 2.hasNext() 3.remove() 
		//Iterator() methods is universal 
		//limitation :don't have replace operator , don't have indexing , don't have previous
		//3.ListIterator : it has nine methods nad it fill ratio or load factor is 100 percent
		//: 1.next() 2.hasNext() 3.hasNextIndex() 4.previous() 5.hasPrevious() 6.hasPreviousIndex() 7.set() 8.add() 9.remove()
		Iterator it=ar.iterator();
		if(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	

}
