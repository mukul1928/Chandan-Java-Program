package class_19_object;

public class String_Functions 
{
	public static void main(String[] args) 
	{
	/*	String name="   Chandan Pandey   ";
		int c1= name.length();
		System.out.println(c1);
		
		String c2=name.toUpperCase();
		System.out.println(c2);
		
		String c3=name.toLowerCase();
		System.out.println(c3);
		
		 char s1=name.charAt(9);
		System.out.println(s1);
		int s2=name.indexOf('P');
		System.out.println(s2);
		*/
		
		
		String nam1="  Chandan Pandey  ";//with space 
		System.out.println(nam1);
		String s3=nam1.trim();//this function we use to remove the extra spaces from the beginning of the String and the ending of the String
		System.out.println(s3);
		
		String name="Ram";
		String surname="Pandey";
		String fullname= name.concat(surname);//this function we use to combine the two string 
		System.out.println(fullname);
		
		String fullname1= name.concat(" ").concat(surname);// for putting the space between the first name and surname we can use this function
		System.out.println(fullname1);
	}
}
