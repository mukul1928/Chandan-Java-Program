package class_28;

class Teacher1
{
	void add()
	{
		System.out.println("This is my Teacher add");
	}
}
class Mentor1 extends Teacher1
{
	void sub()
	{
		System.out.println("This is my Mentor sub");
	}
}
class Exp_Student extends Mentor1
{
	void mul()
	{
		System.out.println("This is my Exp_Student Mentor");
	}
}
public class Upcasting_Case_4_Student 
{
	void div()
	{
		System.out.println("This is my Student div");
	}
	public static void main(String[] args) 
	{
		Mentor1 m1=new Exp_Student();
		m1.add();
		m1.sub();
	}
}
