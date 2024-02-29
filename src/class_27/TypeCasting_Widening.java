package class_27;

public class TypeCasting_Widening 
{
public static void main(String[] args) 
{
	int weight=82;
	double a =weight;//implicit manner
	System.out.println(a);
	
	a=4.8989889;//we can update the values in decimals once we converted the value from int to double 
	System.out.println(a);
	
	double weight1=(double) 90;//widening in explicit way
	System.out.println(weight1);
	
	//=================================
	
	byte a1=90;
	//byte into int->widening
	int a2=a1;
	System.out.println(a2);
	
}
}
