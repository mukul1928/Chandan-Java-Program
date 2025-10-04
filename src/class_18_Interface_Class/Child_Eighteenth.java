package class_18_Interface_Class;
interface parent1
{
	void auth();
	void authentication();
}
interface parent2
{
	void username();
	void password();
}
//multiple level inheritance 
public class Child_Eighteenth implements parent1,parent2
{
	public static void main(String[] args) 
	{
		Child_Eighteenth c=new Child_Eighteenth();
		c.auth();
		c.authentication();
		c.username();
		c.password();
	}
    public void username() 
	{
		System.out.println("Chandan Pandey");
	}
	public void password() 
	{
		System.out.println("chand@123456");
	}
    public void auth() 
	{
        System.out.println("This is my auth o.1");	
	}
    public void authentication() 
	{
		System.out.println("Thsi is my authentication method");
	}

}
