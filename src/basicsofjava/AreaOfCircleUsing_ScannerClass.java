package basicsofjava;

import java.util.Scanner;

public class AreaOfCircleUsing_ScannerClass {
	public static void main(String[] args) {
		//pi*r*r
		System.out.println("Enter the value of radius");
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double area=Math.PI*r*r;
		System.out.println("Area of circle:"+area);
	}
}
