package class_20_ForLoop_String_Functions_Palindrome;

public class Reverse_With_Right_Method 
{
   public static void main(String[] args) 
  {
	String name="Chandan";
	String reverse="";
	for(int i=name.length()-1;i>=0;i--)
	{
		char answer=name.charAt(i);
		
		reverse=reverse+answer;
	}
	System.out.println(reverse);
	
	boolean a1=name.equals(reverse);
	System.out.println(a1);//It will return false because the given string is not a Palindrome
	
	if(a1==true)
	{
		System.out.println("The input is palindrome");
	}
	else
	{
		System.out.println("They are not a palindrome");
	}
  }
}
