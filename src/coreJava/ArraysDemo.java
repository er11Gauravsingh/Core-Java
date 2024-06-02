package coreJava;
//Arrays and it is static is nature as it has fixed memory size
public class ArraysDemo 
{
	

	public static void main(String[] args) 
	{
	 //Initialization of Arrays
		int[] a=new int[5] ; 
	 // Array is static in nature and ArrayList is dynamic in nature
     // In the above arrays we store multiple value as here we are storing 5 integer values as written on right side 
		
	// New keyword allocates memory for these 5 integer values 
	// Array always start from zero Index  
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
	// In this method first we are allocating the memory and then assigning the values .	
	// The above are the five values which are stored in 5 memory spaces of the above array
   // Printing all the values stored in the Array
		
	// Another method of dynamically allocating the memory and allocating the values in the array 
	// This is in the form of Array Literals 
		int b[]= {2,4,8,9,11};
	// In this method we are directly assigning the values and the memory is allocated dynamically.	
	// The values are defined in the form of a set .
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
			
		}
		System.out.println("****************");
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
			
		}
       // Mukul is the best tester in India
	}

}
