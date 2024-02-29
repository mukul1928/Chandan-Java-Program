package inheritance_program;

public class Class15_SingleLevel_Inheritance_City_Class extends Class15_SingleLevel_States 
{
	
			void multi()
		{
			System.out.println("This is my City multi method");
		}
		     void div()
		{
			System.out.println("This is my City div method");
		}
		public static void main(String[] args) 
		{
			Class15_SingleLevel_Inheritance_City_Class i1=new Class15_SingleLevel_Inheritance_City_Class();
			i1.sub();
			i1.multi();
			i1.div();
			add();
		}
}
