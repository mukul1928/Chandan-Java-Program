package class_34_practice_constructor_overloading_this_calling_statement;

public class ConstructorOverloading_This_Calling_Statement 
{
	ConstructorOverloading_This_Calling_Statement()
	{
		System.out.println("This is my constructor without parameters");
	}
	ConstructorOverloading_This_Calling_Statement(int a)
	{this();
		System.out.println("This is my constructor with parameters");
	}
	ConstructorOverloading_This_Calling_Statement(int q,double b)
	{this(12);
		System.out.println("This is my constructor with parameters1");
	}
	ConstructorOverloading_This_Calling_Statement(double e,char c)
	{this(21,12.21);
		System.out.println("This is my constructor with parameters2");
	}
	ConstructorOverloading_This_Calling_Statement(int f,char d)
	{this(23.23,'M');
		System.out.println("This is my constructor with parameters3");
	}
	ConstructorOverloading_This_Calling_Statement(float k,int l)
	{this(112,'C');
		System.out.println("This is my constructor with parameters4");
	}
	public static void main(String[] args) 
	{
		System.out.println("I love coding");
		new ConstructorOverloading_This_Calling_Statement(98);
	}
}
