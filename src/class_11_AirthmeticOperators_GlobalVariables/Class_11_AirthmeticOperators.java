package class_11_AirthmeticOperators_GlobalVariables;
public class Class_11_AirthmeticOperators 
{
	static int number1=100;
	static int number2=50;
	
	
	static void add()
	{
		int sum=number1+number2;
		System.out.println(sum);
	}
	static void sub()
	{
		int substract=number1-number2;
		System.out.println(substract);
	}
	static void mul()
	{
		int multiply=number1*number2;
		System.out.println(multiply);
	}
	static void div()
	{
		int division=number1/number2;
		System.out.println(division);
	}
	static void modu()
	{
		int modulas=number1%number2;
		System.out.println(modulas);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		modu();
	}

}
