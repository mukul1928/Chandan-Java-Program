package class_31_Exceptional_Handling_With_Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_FinallyBlock {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		try {
			int number = s1.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Hey exception come but don't worry I handled it");
		}

		finally {
			System.out.println("I am always there");
		}
	}

}
