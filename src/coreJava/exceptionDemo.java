package coreJava;

public class exceptionDemo 
{
	int a=4;
    
	int k=0;
	
	
		public void getData() 
		{
			System.out.println(k);
		}
	
	

	public static void main(String[] args) 
	{
		exceptionDemo ed= new exceptionDemo();
		int b=7;
		int c=0;
		
		try 
		{
			int arr[]=new int[5];
			//int k = b/c;
		   // ed.getData();
			System.out.println(arr[7]);
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("I catched the Arithematic error/exception");		
		}
		catch(IndexOutOfBoundsException ets) 
		{
			System.out.println("I catched the Index Bound error/exception");	
		}
		catch(Exception e)// It is general exception
		{
		System.out.println("I catched the error/exception");	
		}
		finally 
		{    // We do not need to write blocks for the finally keyword
			// This block is executed irrespective of error is thrown or not 
			
			System.out.println("I want to delete cookies");
			
		}

	}

}
