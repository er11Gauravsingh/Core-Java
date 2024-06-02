package coreJava;
import java.util.*;
import java.util.Scanner;
import java.util.Timer;
public class unique_character_in_word 
{

	public static void main(String[] args) 
	{
		

       String str = "apple";

		for (int i = 0; i < str.length(); i++)
		{
			int flag = 0;
			for (int j = 0; j < str.length(); j++)
			{
				// checking if two characters are equal
				if (str.charAt(i) == str.charAt(j) && i != j) 
				{
					flag = 1;
		
				}
			}
			if (flag == 0)
				System.out.println(str.charAt(i));
		}
	}
	}

	

	


