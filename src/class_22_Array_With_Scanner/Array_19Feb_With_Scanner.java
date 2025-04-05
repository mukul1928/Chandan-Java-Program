package class_22_Array_With_Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Array_19Feb_With_Scanner 
{
public static void main(String[] args) 
{
	int rollno[]=new int [3];
	
	Scanner s1=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the value of Array");
		rollno[i]=s1.nextInt();			
	}
	//Arrays.sort(rollno);
	System.out.println(Arrays.toString(rollno));
}
}
