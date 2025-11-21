package basicsofjava;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the side");
			int s = sc.nextInt();
			int square;
			square=s*s;
			System.out.println("Area of square :" +square);
		}
	}
}
