package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d.toString()); 
	  // This will print the current Date , Time and Year in String format
     // How to print the date and time in your required format 
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
	// Small m is for minute and capital M is for month
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	// To Know more about the format and methods of date visit 
	//	https://www.tutorialspoint.com/java/java_date_time.htm
		
		
		
	}

}
