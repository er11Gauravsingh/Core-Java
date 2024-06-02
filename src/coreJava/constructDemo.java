package coreJava;

public class constructDemo 
{
	// Constructor never return any value as methods 
   // It has the same name as the class 
 public constructDemo() 
 // This is the constructor for this class and it will get executed once the object is created for that class 
{
	 System.out.println("I am the constructor ");
 }
 public constructDemo(int a , int b) 
 {
	 System.out.println("I am the parametrized constructor ");
 }
 public constructDemo(String c) 
 {
	 System.out.println(c);
 }
 public void getData() 
 {
	 System.out.println(" I am the method");
 }
	public static void main(String[] args) 
	{
		
		constructDemo cd = new constructDemo ("Hello");// Since we were not passing any value default constructor was called .
		constructDemo c = new constructDemo (4 ,5);
	// Whenever the object is created for class the constructor automatically get executed 	without call
	// Compiler will call its implicit constructor if the constructor is not defined and is called as default constructor
	}

}
