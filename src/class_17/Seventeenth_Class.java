package class_17;

abstract class Third_Class  //abstract class
{
	abstract void thirdmethod();
	abstract void fourthmethod();
	void add1()  //By creating its object and with the help of its reference variable
	{
		System.out.println("addition of 1 no.s");
	}
	static void add2()  //we can call this method directly by its method name
	{
		System.out.println("addition of 2 no.s");
	}
}
abstract class Second_Class extends Third_Class
{
	abstract void secondmethod();//By creating its object and with the help of its reference variable
	abstract void second_method();//By creating its object and with the help of its reference variable
	
	void add3()//By creating its object and with the help of its reference variable
	{
		System.out.println("addition of 3 no.s");
	}
	void add4()//By creating its object and with the help of its reference variable
	{
		System.out.println("addition of 4 no.s");
	}
}

public class Seventeenth_Class extends Second_Class
{
	void substraction()//By creating its object and with the help of its reference variable
	{
		System.out.println("substraction of 2 no.s");
	}
	void multiplication()//By creating its object and with the help of its reference variable
	{
		System.out.println("multiplication of 2 no.s");
	}
	
	public static void main(String[] args) 
	
	{
		Seventeenth_Class s1=new Seventeenth_Class();
		add2();
		s1.add1();
		s1.add3();
		s1.add4();
		s1.fourthmethod();
		s1.multiplication();
		s1.second_method();
		s1.secondmethod();
		s1.substraction();
		s1.thirdmethod();
	}
	
	void secondmethod() 
	{
		System.out.println("The developer will write the internal logic here");
	}

	void second_method() 
	{
		System.out.println("This is second_method");
	}
	
	void thirdmethod() 
	{
	    System.out.println("This is the thirdmethod");
	}
	
	void fourthmethod() 
	{
		System.out.println("This is the fourthmethod");
	}

}
