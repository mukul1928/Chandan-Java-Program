package basicsofjava;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("the length of rectangle is ");
			int l = sc.nextInt();
			System.out.println("the breath of rectangle is ");
			int b = sc.nextInt();
			System.out.println("the area of rectangle is ");
			int area = (l * b);
			System.out.println("therefore the area of rectangle is " + area);

	}
}
