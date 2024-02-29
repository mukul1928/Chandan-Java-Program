package basicsofjava;

public class Class_10_Local_Variables 
{
	static void add()
	{
		int a=100;
		int a1=200;
		System.out.println(a+a1);
	}
	void substract()
	{
		int a=100;
		int a1=200;
		System.out.println(a-a1);
		
	}
	void substract(int age,String name,char gender)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}
public static void main(String[] args) 
{
	add();
	Class_10_Local_Variables l1=new Class_10_Local_Variables();
	l1.substract();
	l1.substract(20,"Mukul",'M');
}
}
