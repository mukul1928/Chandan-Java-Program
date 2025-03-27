package class_25_Find_Average_RepeatFunction_FactorialUsingScanner;

import java.util.Scanner;

public class Factorial_Using_Scanner {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int factorial = 1;
			for (int i = a; i >= 1; i--) {
				factorial = factorial * i;
			}
			System.out.println(factorial);
		}
	}
}
