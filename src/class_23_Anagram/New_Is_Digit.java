package class_23_Anagram;

public class New_Is_Digit
{
  public static void main(String[] args) 
  {
		String name="Manish123";
		char n1[]= name.toCharArray();
		for(int i=0;i<=name.length()-1;i++)
		{
		
			boolean answer= Character.isDigit(n1[i]);
		if(answer==false)
		  {
			System.out.println("Index position "+i +" is "+"Alphabet");
		  }
		else
		  {
			System.out.println("Index position "+i +" is "+"Numeric");
		  }
		
	    }
	
	}
  }

