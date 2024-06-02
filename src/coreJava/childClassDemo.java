package coreJava;

public class childClassDemo extends parentClassdemo  

	{ 
	// Through extends keyword chilclass can say that is has derived the properties of parent class 
     
	public void audiosystem() 
	{
		System.out.println("My New Audio system");
		
	}
	
	public void engine() 
	{
		System.out.println("New Engine");
		
	}
	
	public void colour() 
	{
		System.out.println(colour ); // As we have inherited the properties of parent class we can use it in child class .
	}
	public static void main(String[] args) 
	{
	// Here we can see that the things which are part of main class are only implemented .
		childClassDemo cd= new childClassDemo();
		cd.colour();
		cd.brakes();
		cd.audiosystem();
		// Here we see that function overriding is taking place as we same method name , parameter and signature .
	   // Here local method is given preference over parent class and the value is overrideen 
	  // So it is called as Functional Overriding

	}

}
