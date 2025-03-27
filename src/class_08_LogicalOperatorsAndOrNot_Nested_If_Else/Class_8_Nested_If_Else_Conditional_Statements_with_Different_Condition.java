package class_08_LogicalOperatorsAndOrNot_Nested_If_Else;

public class Class_8_Nested_If_Else_Conditional_Statements_with_Different_Condition 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int c=300;
		String gender1="Male";
		String gender2="Female";
		String gender3="Custom";
		if(c>b)
		{
			if (a>b)
			{
				if(gender1=="Custom")
				{
					System.out.println("Mukul");
				}
				else
				{
					System.out.println("Pandeyg");
				}
			}
			else
			{
				System.out.println("Chandan Pandey");
			}
		}
	}
}
