package class_27;

class Parent_Class
{
	void add()
	{
		System.out.println("This is my parent add");
	}
	void substract()
	{
		System.out.println("This is my parent substract");
	}
}
public class Upcasting_Child_Class_Case_1 extends Parent_Class
{
	void mul()
	{
		System.out.println("This is my child mul");
	}
	void div()
	{
		System.out.println("This is my child div");
	}
public static void main(String[] args) 
{
	Parent_Class u1=new Upcasting_Child_Class_Case_1 ();//Up Casting
	u1.add();
	u1.substract();
	
	Upcasting_Child_Class_Case_1 c1=(Upcasting_Child_Class_Case_1)u1;//Down Casting
	c1.add();
	c1.div();
	c1.mul();
	c1.substract();
}
}
