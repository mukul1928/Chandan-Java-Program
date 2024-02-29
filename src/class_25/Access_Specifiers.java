package class_25;

public class Access_Specifiers 
{
	 public void add()
	{
		
	}
	 private static void sub()
	 {
		 
	 }
	 protected void mul()
	 {
		 
	 }
	 static void div()
	 {
		 
	 }

	 public static void main(String[] args) 
{
	sub();
	div();
	Access_Specifiers c1=new Access_Specifiers ();
	c1.add();
	c1.mul();	
}
}
