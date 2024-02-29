package assignments;

public class Find_Space 
{
	public static void main(String[] args)
	{
		
	String name="Mukul Pandey";
	
	char c1[]=name.toCharArray();
	
	for(int i=0;i<name.length();i++)
	{
		boolean answer=Character.isSpaceChar(c1[i]);
		
		if(answer==true)
		{
			System.out.println("The given string has a space");
		}
	}
	
	}
}
