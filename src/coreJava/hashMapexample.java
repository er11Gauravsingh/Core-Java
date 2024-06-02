package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		// String is the value and Integer is the key as Hashmap uses Key and value concept 
		// Data is stored as key-value pairs, where values can be added, retrieved, and deleted using keys.
		hm.put(0, "Lovely");
		hm.put(1, "Garima");
		hm.put(2, "Gaurav");
		hm.put(3, "ID Singh");
		hm.put(42,"Rajat");
		System.out.println(hm.get(2));
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sm=hm.entrySet();
		Iterator it =sm.iterator();
		while(it.hasNext()) 
		{
			// System.out.println(it.next());
			Map.Entry mp =(Map.Entry)it.next(); 
		  // Use Map.Entry class to give print separate key and value .
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
