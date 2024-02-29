package Class_23_Anagram;

import java.util.Arrays;

public class Anagram 
{
   public static void main(String[] args) 
{
	String name1="chin";
	String name2="inch";
	if(name1.length()!=name2.length())
	{
		System.out.println("They are not anagram");
	}
	else	
	{
		char n1[]=name1.toCharArray();
		char n2[]=name2.toCharArray();
		System.out.println(n1);
		System.out.println(n2);		
		Arrays.sort(n1);
		Arrays.sort(n2);
		if(Arrays.equals(n1, n2))
	{
      System.out.println("This is an Anagram");     
	}
		else
    {
	  System.out.println("This is not an anagram");
	}
	}
}
}

