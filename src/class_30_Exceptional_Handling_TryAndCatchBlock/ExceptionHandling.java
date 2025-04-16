package class_30_Exceptional_Handling_TryAndCatchBlock;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int c = 1 / 0;
			System.out.println(c);
		} catch (ArithmeticException a1) {
			System.out.println("handled the exception please continue............");
		}
	}
}
