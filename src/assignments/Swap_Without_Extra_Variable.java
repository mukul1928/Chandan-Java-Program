package assignments;

public class Swap_Without_Extra_Variable 
{
 public static void main(String[] args) 
{ 
	int a=432;
	int b=543;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("The value of a "+a);
	System.out.println("The value of b "+b);
}
}
