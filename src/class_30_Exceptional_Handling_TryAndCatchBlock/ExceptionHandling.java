package class_30_Exceptional_Handling_TryAndCatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			Scanner s1 = new Scanner(System.in);
			int a = s1.nextInt();// suppose first time I will enter 1, answer will be 1
			int c = 1 / a;// second time I will enter 0
			System.out.println(c);
		} catch (ArithmeticException a1) {
			System.out.println("handled the exception please continue 1");
		}

		catch (InputMismatchException a2) {
			System.out.println("InputMismatchException handled the exception please continue 2");
		}
	}
}
