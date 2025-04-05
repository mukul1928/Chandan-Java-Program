package class_20_ForLoop_String_Functions_Palindrome;

public class PalinDrome_Reverse_TheString {
	public static void main(String[] args) {

		String name = "mukulukum";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char answer = name.charAt(i);

			reverse = reverse + answer;
		}
		System.out.println(reverse);
		boolean a1 = name.equals(reverse);
		System.out.println(a1);

		if (a1 == true) {
			System.out.println("The given String is a Palindrom");
		} else {
			System.out.println("The given String is not a Palindrome");
		}
	}
}
