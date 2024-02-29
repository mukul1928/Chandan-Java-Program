package class_24;

public class Find_Alphabets_Find_Numerics 
{
public static void main(String[] args) 
{
	String name="Chandan143";
	char c1[]=name.toCharArray();
	int count_of_alpha=0;
	int count_of_numeric=0;
	
	for (int i=0;i<name.length()-1;i++)
	{
		boolean answer=Character.isAlphabetic(c1[i]);
		if (answer==true)
		{
			count_of_alpha++;	
		}
		else
		{
			count_of_numeric++;
		}
	 }
		System.out.println("Count of alphabets in the given String->"+count_of_alpha);
		System.out.println("Count of numeric in the given String->"+count_of_numeric);
	}
}
