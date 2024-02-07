package basicsofjava;

public class Class_11_Global_Variable_2 
{
	static int age;
	static double salary=1092109;
	char gender='M';
	static void substract()
	{
		int age=90;
		System.out.println(age);
	}
	public static void main(String[] args) 
	{
		substract();
		System.out.println(age);
		System.out.println(salary);
		Class_11_Global_Variable_2 g1=new Class_11_Global_Variable_2();
		System.out.println(g1.gender);
	}
}
