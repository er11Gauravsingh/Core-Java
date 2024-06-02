package coreJava;
// Function Overloading
// In Function Overloading either argument count , argument order should be different 
// Argument datatype should be different
public class childlevel extends childClassDemo
{
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a ,int b)
	{
		System.out.println(a+b);	
	}
	public static void main(String[] args) 
	{
		childlevel cl = new childlevel();
		cl.getData(2);
		cl.getData("Shivangi");
	// These are the part of function overloading as we are using multiple same method name in the class
		cl.getData(3, 5);
		
		
	}

}
