package class_24;

public class String_Function_Is_Space {

	public static void main(String[] args) 
	{
		String name="Chandan Pandey";
		char[]c1=name.toCharArray();
		for(int i=0;i<name.length();i++)
	 {
		boolean answer= Character.isSpaceChar(c1[i]);
		if(answer==true)
		{
			System.out.println("There is the space in the given string"+ " The space of the index is seven");
		}
	 }
    }
}

