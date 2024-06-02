
public class PS2 extends PS3
{
	int a;
	public PS2(int a) 
	{
		// Constructor has same name as the class
		// The variable in constructor is called as Instance variable
		// The Variable in class which has global value is called Class Variable
		// This function assign the global value of the class to Instance Variable
		super(a);
		// Through this the constructor of parent class is invoked 
		// Super Keyword is only used when there is inheritance in place and we dont want to use object to invoke the methods of class.
		// Super Keyword will be used as first line of the constructor 
		// Super Keyword activates the parent constructor 
		this.a=a; // This local variable becomes global or class variable with this keyword and it is used in constructor and always used as first statement
	}
	public int increment() 
	{
		a=a+1;
		return a ;
	}
	public int decrement() 
	{
		a=a-1;
		return a ;
	}

}
