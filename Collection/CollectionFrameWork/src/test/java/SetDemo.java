import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class SetDemo
{
	
	@Test
	public void m1()
	{
		//Set is a interface : it has three methods from collection framework 1.hasSet() 2.linkdSet 3.SortedSet()
		//1.hasSet :duplicate not allowed 
		//2.insertion order will not be preserved 
		//3. underline data structure is hasTable
		ArrayList<Integer> ar =new ArrayList<Integer>();
		ar.add(5);
		ar.add(5);
		ar.add(7);
		HashSet h1=new HashSet(ar); //default capacity is 16 and fill ratio or load factor  is .75(75 percent)
		for(Object s:h1)
		{
			System.out.println(s);
		}
		HashSet h2=new HashSet(); 
		
		HashSet h=new HashSet(); //default capacity is 16 and fill ratio or load factor  is .75(75 percent)
		h.add("shahid");
		h.add("shahid");
		//by default behind the scenario set interface has a method comparable and compareTo methods  to get unique key values.
		h.add("asad");
		h.add("musfiq");
		//h.add(new StringBuffer("hi"));
		//h.add(new StringBuffer("hi")); // StringBuffer don't have comparable and compareTo methods thats why it takes duplicate values
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			System.out.println(h2.isEmpty());
		}
	}
	

}

