package class_24;

public class Find_Space 
{
	public static void main(String[] args)
	{
		String name="Chandan Pandey";
		char c1[]=name.toCharArray();//converting my String name to an array
		for(int i=0;i<name.length();i++) 
		{
		boolean answer= Character.isSpaceChar(c1[i]);
		
		if(answer==true)
		{
			System.out.println("There is a space in the given String" +" The index of space is 7");
		}
		}
		
		
	}
  
}
