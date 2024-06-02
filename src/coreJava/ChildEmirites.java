package coreJava;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args)
   {
		ChildEmirites c= new ChildEmirites();
// We have made the object of child class and can inherit the methods of parent class through extends keyword
        c.bodyColor();
        c.safetyGuidelines();
        c.engine();
// ParentAirCraft p = new ParentAirCraft(); We cannot create object of abstract class but if we remove Abstract keyword we can create object .
	}

	@Override
	public void bodyColor() 
	{
		System.out.println("Red Color On The Body");
		
	}

}
