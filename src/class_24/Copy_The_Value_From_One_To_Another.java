package class_24;

import java.util.Arrays;

public class Copy_The_Value_From_One_To_Another 
{
public static void main(String[] args) 
{
	int array1[]=new int[4];
        array1[0]=43;
        array1[1]=65;
        array1[2]=32;
        array1[3]=53;
        
        int array2[]=new int[array1.length];//in java the value gets transferred from right hand side to the left hand side
        for(int i=0;i<4;i++)
        {
		array2[i]=array1[i];	
        }
        System.out.println(Arrays.toString(array2));
        
        System.out.println(Arrays.toString(array1));
}
}
