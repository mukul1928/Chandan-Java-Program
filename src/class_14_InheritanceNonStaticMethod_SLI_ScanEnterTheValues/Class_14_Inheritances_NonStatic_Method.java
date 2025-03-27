package class_14_InheritanceNonStaticMethod_SLI_ScanEnterTheValues;
class Super_Class
{
	void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
}
public class Class_14_Inheritances_NonStatic_Method extends Super_Class 
{
	
	
		void add(int a,int b)
		{
			System.out.println(a+b);
		}
		void sub(int a,int b)
		{
			System.out.println(a-b);
		}
		
		public static void main(String[] args) 
		{
			Class_14_Inheritances_NonStatic_Method i1=new Class_14_Inheritances_NonStatic_Method();
			i1.add(47,42);
			i1.sub(78,24);
			i1.multiplication(22,43);
		}
}


