package demopack;

import java.util.ArrayList;

public class collectiondemo {

	public static void main(String[] args) 
	{
		
		// Print the uniqque number and how many times it is repeated in the array
		
		int a[]= {4,5,5,4,3,4,6,9,6,9,10};
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for (int i =0 ; i<a.length;i++) 
		{ 
			int k=0;
		
		if(!ab.contains(a[i])) 
		{
			ab.add(a[i]);
			k++;
			for(int j=i+1 ;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					k++;
				}
			}
			System.out.println(a[i]+ " is present " +k+ " Times");
			if(k==1) 
			{
				System.out.println(a[i]+" is unique number");
			}
			
		}
		
		
	}
		
		
}
}
