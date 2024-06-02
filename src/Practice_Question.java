
public class Practice_Question {

	public static void main(String[] args) 
	{
		// This is the program to check unique character in string
		String a = "Apple";
		for(int i=0;i<a.length();i++) 
		{
			int flag =1;
			for(int j=0 ;j<a.length();j++) 
			{
				if(a.charAt(i)==a.charAt(j)&&i!=j) 
				{
					flag++;
				}
			}
			
			if(flag==1) 
			{
			System.out.println(a.charAt(i));	
			}
		}
       

	}

}
