package class_24;

public class Find_Alpha_Numeric_Space 
{
	public static void main(String[] args) 
	{
		
		String name="sky is 441";
		char c1[]=name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		
		for(int i=0;i<name.length();i++) 
		{
			
		  boolean answer=Character.isAlphabetic(c1[i]);
		  boolean answer1=Character.isDigit(c1[i]);
		  boolean answer2=Character.isSpaceChar(c1[i]);
		  
		  if(answer==true)
		  {
			  count_of_alpha++;
		  }
		  if (answer1==true)
		  {
			  count_of_numeric++;
		  }
		  if(answer2==true)
		  {
			  count_of_space++;
		  }
		  
		}
		
		  System.out.println("The given string have the alphabets->"+count_of_alpha);
		  System.out.println("The given string have the numeric->"+count_of_numeric);
		  System.out.println("The given string have the space->"+count_of_space);
		
	}
	
}


