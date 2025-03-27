package class_14_InheritanceNonStaticMethod_SLI_ScanEnterTheValues;
import java.util.Scanner;
public class Class_14_Scan2 
{
	static int no1;
	static int no2;
	static void add()
	{
		System.out.println(no1+no2);
	}
	static void sub()
	{
		System.out.println(no1-no2);
	}
	static void mul()
	{
		System.out.println(no1*no2);
	}
	static void div()
	{
		System.out.println(no1/no2);
	}
	static void mod()
	{
		System.out.println(no1%no2);
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int no1=s1.nextInt();
		int no2=s1.nextInt();
		int sum=no1+no2;
		System.out.println(sum);
		sub();
		mul();
		div();
		mod();
	}

}
