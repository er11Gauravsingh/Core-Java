package coreJava;

public class StaticVar 
{
	 // Taking a example for creating census report we need few data which are below 
	// The Variable defined below are called as Instance Variable 
	String name;
	String address;
	static String city="Noida" ;
	static int i=0;
	/* We can also create a static block and write variables under it.
	static
	{ 
	city ="Noida";
	i=0;
	}*/
	
	StaticVar(String name , String address )// The Variable in the constructor are local as its scope is local . 
	{
		this.name=name;
		this.address=address;
		i++;
	 // The instance variable are activated through this keyword
	}
	public void getAddress() 
	{
		System.out.println(address+" "+city);
	}
	public static void getcity() 
	{
		System.out.println(city);
	}
	
	

	public static void main(String[] args) 
	{
		
		StaticVar sv = new StaticVar("Gaurav","Nirala Estate");
		StaticVar sv1 = new StaticVar("Shivangi","Nirala Aspire");
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getcity(); // We can call static method with class name
		StaticVar.i=4;
		// We do not need to create Object in order to use static methods 
	}

}
