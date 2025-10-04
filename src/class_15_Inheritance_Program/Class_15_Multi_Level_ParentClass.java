package class_15_Inheritance_Program;

public class Class_15_Multi_Level_ParentClass 
{
	void add()
	{
		System.out.println("This is my parent class");
	}
	void sub()
	{
		System.out.println("This is my SUB");
	}
}
class child extends Class_15_Multi_Level_ParentClass

{
	void mul()
	{
		System.out.println("This is my child class");
	}
	void div()
	{
		System.out.println("This is my div");
	}
}
class child_2 extends child
{
	void mod()
	{
		System.out.println("This is my child_2 class");
	}
public static void main(String[] args) 
    {
	child_2 c1=new child_2();
	c1.add();
	c1.sub();
	c1.mul();
	c1.div();
	c1.mod();
	}
}



