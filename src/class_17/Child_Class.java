package class_17;

abstract class Parent_Class //exposing this only

{
	abstract void add();//abstract method will always be non-static 
	abstract void substract();
	void multi()
	{
		System.out.println("This is the logic which I am exposing");
	}
	static void modulous()
	{
		System.out.println("This is the logic which I am exposing to the third party");
	}
}

public class Child_Class extends Parent_Class

{
	
	void add() //Concrete method
	{
	   System.out.println("Real Logic");	
	}	
	
	void substract() 
	{
		System.out.println("Internal logic for substraction");
	}
	
	public static void main(String[] args) //Concrete method
	
	{
		Child_Class c1=new Child_Class();
		c1.add();
		c1.substract();
		modulous();
		c1.multi();
	}
}
