package class_15_object;

class Parent_Class
{
	Parent_Class()
	{
		System.out.println("Parent Constructor");
	}
}
public class ObjectClass15 extends Parent_Class
{
	ObjectClass15()
	{super();//both the constructor is getting executed because of the super calling statements with this super keyword
		System.out.println("Child Constructor");
	}
public static void main(String[] args) 
    {
	new ObjectClass15();
    }
}
