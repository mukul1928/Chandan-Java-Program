package class_21;

public class Class_21 
{
public static void main(String[] args) 
     {
	String a="orange";
	String answer1= a.substring(1);
	System.out.println(answer1);
	
	    String answer2= a.substring(1,3);
	    System.out.println(answer2);
	    
	    String s1="chandan pandey";
	    boolean a1= s1.contains("pandey");
	    System.out.println(a1);
	    
	    String s2="orange";
	    boolean a2= s2.matches("o.....");//expression 
        System.out.println(a2);
        
	    boolean a3= s1.matches("(.*)e");
	    System.out.println(a3);
	   
	    boolean a4=s1.matches("s(.*)");
	    System.out.println(a4);
	    
	    String name="ram";
	    boolean a5= name.matches("...");
	    System.out.println(a5);
	    }
}
