package class_20_ForLoop_String_Functions_Palindrome;

public class For_Loop_For_Reverse_String {
	public static void main(String[] args) {
		String name = "orange";

		for (int i = name.length() - 1; i >= 0; i--) {
			char answer = name.charAt(i);
			System.out.print(answer);
			// System.out.println(answer);
		}
	}
}
