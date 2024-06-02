package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) 
	{
	 // This Program is used to fetch the calendar library and use it as per our need .
		Calendar cal = Calendar.getInstance(); 
	// This class has some more features as compared to Date Class .
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		//For PM it prints 1
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
