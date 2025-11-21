<<<<<<<< HEAD:src/class_25_Find_Average_RepeatFunction_FactorialUsingScanner/Find_Average.java
package class_25_Find_Average_RepeatFunction_FactorialUsingScanner;
========
package class_25_AccessSpecifier_Find_Average_RepeatFunction;
>>>>>>>> d0a908e75bd5e2697b5d1ef593cd7e8a01b29d6f:src/class_25_AccessSpecifier_Find_Average_RepeatFunction/Find_Average.java

public class Find_Average 
{
	public static void main(String[] args) 
	{
		int array[]=new int[5];
		array[0]=40;
		array[1]=47;
		array[2]=34;
		array[3]=65;
		array[4]=54;
		double sumofno=0;
		
	/*double average=(array[0]+array[1]+array[2]+array[3]+array[4]/array.length);//not the right way to solve the question as of now
	System.out.println(average);
	*/
	
	for(int i=0;i<=4;i++)
	{
	sumofno=sumofno+array[i];
	}
		System.out.println(sumofno);
		
		double average=sumofno/array.length;
		
		System.out.println("Average is->"+average);
	}

}
