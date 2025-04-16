package class_28_UpCasting;
class Teacher2
{
	void add()
	{
		System.out.println("This is my teacher add");
	}
}
class Mentor2 extends Teacher2
{
	void sub()
	{
		System.out.println("This is my mentor sub");
	}
}
public class Upcasting_Case_3_Student extends Mentor2
{
	void mul()
	{
		System.out.println("This is my student mul");
	}
public static void main(String[] args) 
{
	Teacher2 t1=new Upcasting_Case_3_Student();//Up Casting from teacher will only fetch that particular properties 
	t1.add();
	/*
	Upcasting_Case_3_Student s2=(Upcasting_Case_3_Student)t1;//Down Casting 
	s2.add();
	s2.mul();
	s2.sub();
	*/
}
}
