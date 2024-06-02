package coreJava;

import java.util.ArrayList;

public class arrayListexample 
{
	public static void main(String[] args) {
		
		ArrayList<String> a =new ArrayList<String>(); 
	    // The above is the way how we define array List and  it is a dynamic form as its size is not fixed
		 a.add("Gaurav");
		 a.add("Java");
		 a.add("Shivangi");
		 a.add("Aditya");
		 a.add("Sarita");		 
		 System.out.println(a); // We do not need any for loop for printing the data
		 a.add(1, "Shivangi"); // This is used to add name at given Index
		 a.remove(4);
		 System.out.println(a);
		 System.out.println(a.get(2));
		 System.out.println(a.contains("Shivangi")); //Contains method will return type is Boolean
		System.out.println(a.indexOf("Shivangi"));// It will give first found element if duplicacy is there
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

	}

}
