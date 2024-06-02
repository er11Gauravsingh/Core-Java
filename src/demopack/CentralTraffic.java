package demopack;

public interface CentralTraffic 
    
{ 
	 // We cannot define the body of the method in the interface
	//We can also define variable but with public access modifier if not defined it will treat as public 
	// As we using the methods and variables of interface in another class so we have to declare it public as implementation is in another class 
	public int a =10; int b=8;
	public void greenGo();
	public void redStop();
	public void FlashYellow();

}
