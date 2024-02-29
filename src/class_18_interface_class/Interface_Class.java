package class_18_interface_class;

interface One

{
	void add(); //abstract method without writing abstract in front of it
	void substract(); //abstract method without writing abstract in front of it
}

public class Interface_Class implements One
{
	void areaofrectangle()
	{
		System.out.println("This is  my concrete method 1");
	}
	void circleofarea()
	{
		System.out.println("this is my concrete method 2");
	}
	
	public static void main(String[] args) 
	
	{
		Interface_Class i=new Interface_Class();
		i.add();
		i.areaofrectangle();
		i.circleofarea();
		i.substract();
	}
    public void add() 
	{
		System.out.println("The real logic");
	}

	public void substract() 
	{
		System.out.println("The real logic can be here");
	}
}
