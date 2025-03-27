package class_11_AirthmeticOperators_GlobalVariables;
public class Class_11_Global_Variable 
{
	static int age;//Global variable
	static double salary;//Global variable
	char gender='M';//Declaration and Initialization of gender variable with char data type
	void add()
	{
		age=90;
	}
	static void substract()
	{
		System.out.println(age);
		System.out.println(salary);
	}
	public static void main(String[] args) 
	    {
			System.out.println(age);
			System.out.println(salary);
			substract();
			Class_11_Global_Variable g1=new Class_11_Global_Variable();
			System.out.println(g1.gender);//you need to add the reference variable name to get output(g1)
		}
	}


