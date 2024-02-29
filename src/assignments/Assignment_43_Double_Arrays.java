package assignments;

import java.util.Arrays;

public class Assignment_43_Double_Arrays 
{
	public static void main(String[] args) 
	{
		double salary[]=new double[5];
		salary[0]=50000;
		salary[1]=55999;
		salary[2]=67393;
		salary[3]=75993;
		salary[4]=85000;
		Arrays.sort(salary);
		
		String SalaryList = Arrays.toString(salary);
		System.out.println(SalaryList);
		
		boolean attendance[]=new boolean[3];
		attendance[0]=true;
		attendance[1]=false;
		//by default the boolean value of 2nd index is false
		//we cannot sort the values of boolean data types
		System.out.println(Arrays.toString(attendance));
	}

}
