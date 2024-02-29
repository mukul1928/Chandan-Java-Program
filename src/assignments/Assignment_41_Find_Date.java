package assignments;

import java.util.Date;

public class Assignment_41_Find_Date 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d2);
		Date d3=new Date(d1.getTime()-(1000*60*60*24*10));
		System.out.println(d3);

	}

}
