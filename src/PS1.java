import org.testng.annotations.Test;

public class PS1 extends PS 
{ 
 // Through Extends keyword PS becomes the parent class of PS1 and PS1 becomes child class
// Through Inheritance you can acquire the properties of parent class
// If Inheritance was not there we have to make object of that class to inherit the class the methods, variables of the class.
// Since we are using inheritance PS1 class which is the child class or sub class will have the knowledge of methods of parent class PS
// It will run before the method testRun
		
	@Test
	public void testRun()
	{
		PS2 ps2 = new PS2(3); // Object of PS2 to use it here
		int a =3 ;
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		// PS3 ps3=new PS3() Since we are using super key
		System.out.println(ps2.multiplyThree());
		System.out.println(ps2.multiplyTwo());
	}

}
