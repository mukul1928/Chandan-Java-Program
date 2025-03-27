package class_18_Interface_Class;
interface parent01
{
	void add();
	void substract();
}
interface parent02
{
	void mul();
	void div();
}
interface parent03
{
	void mod();
	void username();
}
interface parent04
{
	void min();
	void password();
}
public class Interface_Class_18 implements parent01,parent02,parent03,parent04
{
	public static void main(String[] args) 
	{
		Interface_Class_18 i= new Interface_Class_18();
		i.add();
		i.substract();
		i.mul();
		i.div();
		i.min();
		i.username();
		i.password();
		i.mod();
	}
	public void min() 
	{
		System.out.println("this is my min");
	}
	public void password() 
	{
		System.out.println("this si my password");
	}
	public void mod() 
	{
		System.out.println("this is my mod");
	}
	public void username() 
	{
		System.out.println("this is my username");
	}
	public void mul() 
	{
		System.out.println("this is my mul");
	}
	public void div() 
	{
        System.out.println("this is my div");	
	}
    public void add() 
	{
	    System.out.println("this is my add");
	}
	public void substract() 
	{
		System.out.println("this is my substract");
	}
}
