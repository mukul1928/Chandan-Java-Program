package assignments;

import java.util.Scanner;

public class Factorial_Practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int factorial = 1;
		for (int i = a; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
