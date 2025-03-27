package class_15_constructors_calling;

class G_Parent
{
	G_Parent( int a,double b)
	{
		System.out.println("This is my G_Parent constructor");
	}
	
}
class Parent extends G_Parent
{
    Parent(String a)
    { super(100,6.34);
    	System.out.println("This is my parent constructor");
    }
}
public class Child extends Parent
{
	Child()
	{ super("Chandan Pandey");//super calling statement of parameterized Explicitly types
		System.out.println("This is my child constructor");
	}
	public static void main(String[] args) 
	{
		new Child();
	}
}
