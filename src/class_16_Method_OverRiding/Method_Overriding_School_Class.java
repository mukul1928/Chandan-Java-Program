package class_16_Method_OverRiding;
class Collage
   {
	void bookstowrite()
	{
		System.out.println("Writing to study");
	}
   }
public class Method_Overriding_School_Class extends Collage
{
	void bookstowrite()
	{
	System.out.println("Writing to top the class");
	super.bookstowrite();//super keyword for invoking the parent class method along with child class method
	}
public static void main(String[] args) 
   {
	Method_Overriding_School_Class s1=new Method_Overriding_School_Class();
	s1.bookstowrite();
	
   }
}
