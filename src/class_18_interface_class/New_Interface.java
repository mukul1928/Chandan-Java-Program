package class_18_interface_class;
interface parent001
{
	void add();
	void sub();
}
abstract class one01 implements parent001
{
    abstract void add1();
    abstract void sub1();
    void min()
    {
    	System.out.println("min");
    }
    void max()
    {
    	System.out.println("max");
    }
}
abstract class two02 extends one01
{
	abstract void mul();
	abstract void div();
}
public class New_Interface extends two02
{
    void mod()
    {
    	System.out.println("mod");
    }
    void modulous()
    {
    	System.out.println("modulous");
    }
    
public static void main(String[] args) 
      {
	New_Interface n=new New_Interface();
	n.add();
	n.add1();
	n.div();
	n.max();
	n.min();
	n.mod();
	n.modulous();
	n.mul();
	n.sub();
	n.sub1();
      }

public void add() 
{
	System.out.println("add");
}

public void sub() 
{
	System.out.println("sub");
}

void mul() 
{
    System.out.println("mul");
}

void div() 
{
	System.out.println("div");
}

void add1() 
{
	System.out.println("add1");
}

void sub1() 
{
	System.out.println("sub1");
}
}
