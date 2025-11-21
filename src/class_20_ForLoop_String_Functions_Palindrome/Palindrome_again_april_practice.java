package class_20_ForLoop_String_Functions_Palindrome;

public class Palindrome_again_april_practice {
	public static void main(String[] args) {
		String name = "MakkaM";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char answer = name.charAt(i);
			reverse = reverse + answer;

		}
		System.out.println(reverse);
		boolean value = name.equals(reverse);
		System.out.println(value);
		if (value == true) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}
