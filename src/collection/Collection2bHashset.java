package collection; //21  // 9-2-23

import java.util.HashSet;

public class Collection2bHashset // No INDEX concept is present- NO--> get,replce(set)
{
	public static void main(String[] args)  
	{
		HashSet x = new HashSet();   // Upcasting  // Interface x = new Class--> Set x = new Hashset();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add("viraj");
		x.add('A');
		x.add(44.10);
		System.out.println(x);  // Random output
		x.remove(44.10);
		System.out.println(x);
			
		
	}

}
