package class_22;

import java.util.Arrays;

public class Array_19_Feb24 
{
public static void main(String[] args) 
{
	String name[]=new String[5];
	name[0]="Ram";
	name[1]="Sita";
	name[2]="Laxman";
	name[3]="Bharat";
	name[4]="Satrudhan";
	
	Arrays.sort(name);
	System.out.println(Arrays.toString(name));
}
}
