package assignments;

public class Calling_Ten_Constructors 
{
	Calling_Ten_Constructors()
	{
		System.out.println(1);
	}
	Calling_Ten_Constructors(int a)
	{
		System.out.println(2);
	}
	Calling_Ten_Constructors(long k,int b)
	{
		System.out.println(3);
	}
	Calling_Ten_Constructors(char c)
	{
		System.out.println(4);
	}
	Calling_Ten_Constructors(float d)
	{
		System.out.println(5);
	}
	Calling_Ten_Constructors(char e,double f)
	{
		System.out.println(6);
	}
	Calling_Ten_Constructors(float g,double h)
	{
		System.out.println(7);
	}
	Calling_Ten_Constructors(long j,char m)
	{
		System.out.println(8);
	}
    Calling_Ten_Constructors(double n)
    {
    	System.out.println(9);
    }
    Calling_Ten_Constructors(boolean r)
    {
    	System.out.println(10);
    }
	public static void main(String[] args) 
	{
		Calling_Ten_Constructors s1=new Calling_Ten_Constructors();
		new Calling_Ten_Constructors(10);
		new Calling_Ten_Constructors(109090909,47);
		new Calling_Ten_Constructors('C');
		new Calling_Ten_Constructors(12.12345f);
		new Calling_Ten_Constructors('E',45.754);
		new Calling_Ten_Constructors(16.12345f,79.3535);
		new Calling_Ten_Constructors(432748927,'M');
		new Calling_Ten_Constructors(1897676.87);
		new Calling_Ten_Constructors(true);
	}

}
