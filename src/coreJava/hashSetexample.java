package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Aditya");
		hs.add("Shivangi");
		hs.add("Aditya");
		hs.add("vardhan Aditya");
		hs.add("Chomu baba");
 // Here in output we can see no duplicate element are added to set
		System.out.println(hs);
		hs.remove("Shivangi");
	 System.out.println(hs);
	 System.out.println(hs.isEmpty());
	 System.out.println(hs.size());
	 
	 // Iterator
	 Iterator<String> i = hs.iterator();
	 System.out.println(i.next());
	 System.out.println(i.next());			
	 System.out.println(i.next()); 
 //Every we do i.next() iterator moves to the next index in set.
// Initially it goes into the zero Index .
// When we print it , then it will show the value present at that index .
// Iterator works by creating an object and using different methods to use it .
	 while(i.hasNext()) // This we can use when we have multiple values 
	 {
		 System.out.println(i.next()); // It will print till the value at index one by one till last index 
	 }
	 
	 
	}

}
