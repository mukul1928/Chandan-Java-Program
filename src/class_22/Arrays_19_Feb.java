package class_22;

import java.util.Arrays;

public class Arrays_19_Feb
{
   public static void main(String[] args) 
{
	int age[]=new int[3];
	age [0]=90;
	age [1]=16;
	age [2]=52;
	age [2]=104;//update the value of your any index in Array
	//age [3]=23;//if I go beyond the limit of my int[3] it will show exception(ArrayIndexOutOfBoundsException)

	Arrays.sort(age);
	
	for(int i=0;i<=2;i++)
	{
	System.out.println(age[i]);
	}
	//System.out.println(age[1]);
	//System.out.println(age[2]);
}
 
}
