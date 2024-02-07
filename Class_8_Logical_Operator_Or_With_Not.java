package basicsofjava;

public class Class_8_Logical_Operator_Or_With_Not 
{
	public static void main(String[] args) 
	{
		int age=19;
		int salary=10000;
		if(!(age>18||salary>7000))
		{
			System.out.println("Be Ready");
		}
		else
		{
			System.out.println("Not Ready");
		}
	}

}
