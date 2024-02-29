package methodoverriding_Class16;

public class This_Keyword 
{
	int age; //0
	String name; //null
	double salary;  //0.0
	void add(int age,String name,double salary)
	{
		this.age=age;//this keyword is assigning the value of your global age to your local age
        this.name=name;
        this.salary=salary;
	}
	public static void main(String[] args) 
	{
		This_Keyword k1=new This_Keyword();
		k1.add(17,"Hanuman ji",9809);
		System.out.println(k1.age);
		System.out.println(k1.name);
		System.out.println(k1.salary);
	}
}
