package class_24;

import java.util.Arrays;

public class Copy_One_Array_To_Another_Array 
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
	array1[0]=43;
	array1[1]=85;
	array1[2]=74;
	array1[3]=96;
  
	int array2[]=new int[array1.length];
	 for(int i=0;i<4;i++)
	 {
		 array2[i]=array1[i];
	 }
	 /*System.out.println(array2[0]);
	 System.out.println(array2[1]);
	 System.out.println(array2[2]);
	 System.out.println(array2[3]);*/
	 
	 System.out.println(Arrays.toString(array1));
	 
	 System.out.println(Arrays.toString(array2));
	 
}
}
