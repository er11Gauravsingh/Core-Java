package coreJava;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic 
    // The Scope of  Continental Traffic is limited to Central Traffic so while calling it is not showing
    // So we have to define the object
    {

	public static void main(String[] args) 
	{
		CentralTraffic a = new AustralianTraffic();
     // Through this way also we can create object to use methods present in CentralTrafficInterface 
		a.FlashYellow();
		a.greenGo();
		a.redStop();
		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbol();
		ContinentalTraffic  ct = new AustralianTraffic();
		//Through this way also we can create object to use methods present in ContinentalTrafficInterface
		ct.Trainsymbol();
		
	}
	public void walkonsymbol() 
	{
		System.out.println("walking");
	}

	@Override
	public void greenGo() 
	{
		System.out.println("greenGo implementation");	
		
	}

	@Override
	public void redStop() 
	{
		System.out.println("redstop implementation");
		
	}

	@Override
	public void FlashYellow() {
		System.out.println("FlashYellow implementation");
		
	}
	@Override
	//@Override @Override annotation informs the compiler that the element is meant to override an element declared in a superclass.
	// This is used when we use interface or inheritance concept to avoid errors
	public void Trainsymbol() 
	{
	System.out.println("TrainSymbol");
		
	}

}
