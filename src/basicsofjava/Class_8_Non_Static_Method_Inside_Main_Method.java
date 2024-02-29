package basicsofjava;

public class Class_8_Non_Static_Method_Inside_Main_Method 
{
	void add() 
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Printing the Non Static method inside the main method");
		Class_8_Non_Static_Method_Inside_Main_Method s1=new Class_8_Non_Static_Method_Inside_Main_Method();//this is how we create an object
		s1.add();//calling the non static method
	}

}
