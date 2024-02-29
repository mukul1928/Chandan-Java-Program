package class_22;

public class Array_19Feb_Find_34 
{
public static void main(String[] args) 
{
	int number[]=new int[3];
	number[0]=121;
	number[1]=34;
	number[2]=968;
	int no_to_check=34;
	
	for(int i=0;i<=2;i++)
	{
		if(no_to_check==number[i])
		{
			System.out.println("Hey I found the number");
		}
	}
}
}
