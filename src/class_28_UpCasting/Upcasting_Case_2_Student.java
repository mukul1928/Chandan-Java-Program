package class_28_UpCasting;
class Teacher
{
	void substract()
	{
		System.out.println("This is my Teacher substract");
	}
}
class Mentor extends Teacher
{
	void mul()
	{
		System.out.println("This is my Mentor mul");
	}
}
public class Upcasting_Case_2_Student extends Mentor
{
	void add()
	{
		System.out.println("This is my Student add");
	}
public static void main(String[] args) 
{
	Mentor m1=new Upcasting_Case_2_Student();//Up Casting from student to mentor 
	m1.mul();
	m1.substract();
	Upcasting_Case_2_Student s2=(Upcasting_Case_2_Student)m1;//Down Casting from mentor to student
//After Down Casting we can access each and every methods from every class(teacher,mentor,student)
	s2.add();
	s2.mul();
	s2.substract();
	
	
}
}
