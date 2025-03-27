package class_18_Interface_Class;

interface one
{
	void add();
	void substract();
}

interface two extends one
{
	void add1();
	void add2();
}

public class Child_Class implements two

{
	void circle()
	{
		System.out.println("1");
	}
	static void rectangle()
	{
		System.out.println("2");
	}
    public static void main(String[] args) 
    {
		Child_Class c=new Child_Class();
		c.add();
		c.add1();
		c.add2();
		c.circle();
		rectangle();
		c.substract();
	}

	public void add1() 
	{
		System.out.println("3");
	}
	
	public void add2() 
	{
		System.out.println("4");
	}
	
	public void add() 
	{
		System.out.println("5");
	}
	
	public void substract() 
	{
		System.out.println("6");
	}
}
