package class_24;

public class Find_Alpha_Find_Numeric_Values 
{
	public static void main(String[] args) 
	{
		String name="Mango";
		char c1[]=name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			
			if(answer==true)
			{
				count_of_alpha++;
				//System.out.println("Index position "+" is "+" Alphabets");
			}
			else
			{
				count_of_numeric++;
				//System.out.println("Index position "+" is "+" Numeric");
			}
		}
	System.out.println("Count of alphabets in the given string is->"+count_of_alpha);
	System.out.println("Count of numeric value in the given string is->"+count_of_numeric);
	}
	
	

}
