package coreJava;

public class CiscoInterview {

	public static void main(String[] args) 
	{
// Find the minimum number in matrix and when found find the maximum number in same column where min is found 
//int def[][]=new int[3][3];
		int abc[][]= {{2,4,0},{3,1,7},{8,9,10}};
		int i ,j = 0 ; 
		int mincolumn = 0; 
		int minrow = 0 ;
// This is program for finding minimum number in a matrix
		int min =abc[0][0];
		for( i=0;i<3;i++) 
		{
		for( j=0;j<3;j++) 
		{
			if(abc[i][j]<min) 
			{
			min=abc[i][j];
			mincolumn=j;
			
		}
			//System.out.println(abc[i][j]);
		}
		
		}
		System.out.println(min);
	    int k=0;
		int max=abc[0][mincolumn];
		while(k<3) 
		{
			if(abc[k][mincolumn]>max) 
			{
				max=abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
		
	}

}
