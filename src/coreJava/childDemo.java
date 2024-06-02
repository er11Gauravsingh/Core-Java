package coreJava;

public class childDemo extends parentDemo 
{
	String name ="QAClickAcademy";
	
	public childDemo() 
	{
		super(); // Super Constructor should ne the first line in the child constructor and used to invoke constructor of parent class .
		System.out.println("Child Class Constructor");
		// We must also know that constructor invoked first while executing the program before the main method 
	}
	
	public void getStringdata() 
	{
		System.out.println(name);// Local variable is given more preference over parent class variable
		System.out.println(super.name);
		// It give preference to parent class over child class as super keyword invokes the parent class constructor
	}
	public void getData() 
	{
		System.out.println("I am in the child class");
		super.getData();
	}

	public static void main(String[] args) 
	{
		childDemo cd = new childDemo();
		 cd.getStringdata();
	// It prints qaclickacademy as it gives preference to local variable over parent class 
		cd.getData();
	}

}
