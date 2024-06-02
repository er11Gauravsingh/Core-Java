package coreJava;

public abstract class ParentAirCraft 
{
	public void engine() // It is non abstract because it has Body
	{
		System.out.println("Follow Engine GuideLines");
	}
	public void safetyGuidelines() 
	{
		System.out.println("Follow Safety Guidelines");
	}
	public abstract void bodyColor();

}
