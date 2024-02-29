package Class_23_Anagram;

public class Find_Characters_Find_Numeric 
{
 public static void main(String[] args) 
 {
	String name="Chandan";
	char[] c1=name.toCharArray();
	for(int i=0;i<=name.length()-1;i++)
	{
		boolean answer=Character.isAlphabetic(c1[0]);
		System.out.println(answer);
		
	}
 }
}
