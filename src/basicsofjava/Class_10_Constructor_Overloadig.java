package basicsofjava;

public class Class_10_Constructor_Overloadig 
{
	Class_10_Constructor_Overloadig()
	{
		System.out.println("Constructor Overloading Without Parameter");
	}
	Class_10_Constructor_Overloadig(int a,int b,int c,double d)
	{
		System.out.println("Constructor Overloading with different variables");
	}
	Class_10_Constructor_Overloadig(String a)
	{
		System.out.println("Constructor Overloading With Parameter");
	}
public static void main(String[] args) 
    {
	new Class_10_Constructor_Overloadig();
	new Class_10_Constructor_Overloadig("I Love Myself");
	new Class_10_Constructor_Overloadig(12,13,16,17.3);
    }
}

