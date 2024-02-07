package basicsofjava;

public class Class_9_Constructors 
{
	Class_9_Constructors()
	{
		System.out.println("This is my construstor");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is my main method");
		Class_9_Constructors c1=new Class_9_Constructors();//This is how you invoke a constructor
		new Class_9_Constructors();//Another way to invoke the constructor
		new Class_9_Constructors();
		new Class_9_Constructors();
	}
}
