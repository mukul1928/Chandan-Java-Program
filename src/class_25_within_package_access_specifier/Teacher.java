package class_25_within_package_access_specifier;

public class Teacher
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
	    s1.learning_AT();
	    s1.learning_MT();
	    Student.learning_SQL();//calling the static method from different class within the same package
		
	}

}
