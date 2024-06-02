package coreJava;

public class NestedLoop {

	public static void main(String[] args) 
	
	{
		//NestedLoop
		/*for (int i =1 ; i<=4;i++) // Outer For Loop
		{  
			System.out.println("Outer Loop Started");
			for(int j=1;j<=4;j++) // Inner Loop
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer Loop Finished");
			
		} */
		
/*print1234
	   567
	   89
	   10*/
		/* int k=1;
		for (int i=0 ; i<4;i++) // Outer For Loop
		{  
			
			for(int j=1;j<=4-i;j++) // Inner Loop
			{
				System.out.print(k);
				System.out.print(" ");
				k++;
				
			}
			
			System.out.println("");
			
		} */
		
   /*Print 1
		   23
		   456
		   78910*/
	/*	int m=1;
		for (int i=1 ; i<=4;i++) // Outer For Loop
		{  
			
			for(int j=1;j<=i;j++) // Inner Loop
			{
				System.out.print(m);
				System.out.print(" ");
				m++;
				
			}
			
			System.out.println("");
			
		} */
		
/*Print 1
	    1 2
	    1 2 3 
	    1 2 3 4 */
		
		
		/* for (int i=1 ; i<=4;i++) // Outer For Loop
		{  
			
			for(int j=1;j<=i;j++) // Inner Loop
			{
				System.out.print(j);
				System.out.print(" ");
				
				
			}
			
			System.out.println("");
			
		} */
		
	/*Print 3
		  * 6 9
		  * 12 15 18 */
		int n =3;
		for (int i=1 ; i<=3;i++) // Outer For Loop
		{  
			
			for(int j=1;j<=i;j++) // Inner Loop
			{
				System.out.print(n);
				System.out.print(" ");
				n=n+3;
				
			}
			
			System.out.println("");
			
		} 
		
		  
		 
		
		

	}

}
