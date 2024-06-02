package coreJava;

public class Multidimensional {

	public static void main(String[] args) 
	{
		int a[][]= new int [2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		// If we want to print 2nd row 1st Column
		System.out.println(a[1][0]);
		// Another method of defining multi dimensional arrays 
		int b[][]= {{1,2,3},{4,5,6},{9,10,11}};
		for(int i=0;i<2;i++) // Outer For loop stands for row 
		{
			for(int j=0;j<3;j++) // Inner For loop for column
			{
				System.out.println(a[i][j]);
			}
		}
			
		System.out.println(b[2][0]);

	}

}
