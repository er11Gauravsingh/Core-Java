package coreJava;

public class InterviewMinnumber {

	public static void main(String[] args) 
	{
	 //int def[][]=new int[3][3];
		int abc[][]= {{2,4,5},{3,4,7},{1,9,11}};
	// This is program for finding minimum number in a matrix
		int min =abc[0][0];
		for(int i=0;i<3;i++) 
		{
		for(int j=0;j<3;j++) 
		{
			if(abc[i][j]<min) 
			{
			min=abc[i][j];
		}
		}
		
		}
		System.out.println(min);
		
	}

}
