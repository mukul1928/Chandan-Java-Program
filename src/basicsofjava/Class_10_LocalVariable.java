package basicsofjava;

public class Class_10_LocalVariable 
{
	static int rollno;//global variable
	//In java we have four things
	//declaration when you are writing int a;
	//Initialization a=100
	//utilization means using that variable somewhere
	//implementation means whatever is present inside the method is called implementation
    static void substract()
    {
    	double pi;//declaration
    	pi=3.14;
    	System.out.println(pi);
    }
    void add()
    {
    	int number=100;//local variable
    	System.out.println(number);
    }
	public static void main(String[] args) 
	{
		//System.out.println(number);
		//int a=100 //local variable
		System.out.println(rollno);
	}

}
