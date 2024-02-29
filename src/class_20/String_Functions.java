package class_20;

public class String_Functions 
{
public static void main(String[] args) 
   {
	 String name="Orange";
	 boolean answer= name.endsWith("e");
	 System.out.println(answer);
	 
	 String answer1=name.replace('g', 'A');
	 System.out.println(answer1);
	 
	 String n1="orange fruit";
	 String answer2= n1.replaceAll("fruit", "and banana");
	 System.out.println(answer2);
	 
	 String name1="world no 1";
	   System.out.println(name1.replaceAll("[0-9]",""));
	   
	 String name2="world no 2";
	 System.out.println(name2.replaceAll("[0-9]", "America"));
	 
	 String name3="world no 3";
	 System.out.println(name3.replaceAll("[a-z]",""));
	 
	 String name4="manish Kumar TIWARI";
	 System.out.println(name4.replaceAll("[a-z]",""));
	 
	 System.out.println(name4.replaceAll("[A-Z]",""));
	 
	 String m1="";
	 System.out.println(m1.isEmpty());
	 
	 System.out.println(name4.equals(name));
	 System.out.println("chandan".equals("Chandan"));
	 System.out.println("Chandan".equals("Chandan"));
	 
   }
}
